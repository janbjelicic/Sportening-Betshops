import UIKit
import RxSwift

class BetshopDetailsViewController: UIViewController {

    // MARK: - Outlets
    @IBOutlet weak var lblName: UILabel!
    @IBOutlet weak var lblAddress: UILabel!
    @IBOutlet weak var lblCityCounty: UILabel!

    @IBOutlet weak var labelWorkingHours: UILabel!
    @IBOutlet weak var buttonRoute: UIButton!

    // MARK: - Properties
    private var viewModel: BetshopDetailsViewModel!
    private let disposeBag = DisposeBag()

    // MARK: - Setup
    func configure(viewModel: BetshopDetailsViewModel) {
        self.viewModel = viewModel
    }

    // MARK: - Lifecycle
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        setupStyle()
        bindViewModel()

        viewModel.input.viewWillAppear.onNext(())
    }

    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)

        UIView.animate(withDuration: 0.3, animations: { [weak self] in
            let frame = self?.view.frame
            let yComponent = UIScreen.main.bounds.height - 200
            self?.view.frame = CGRect(x: 0.0,
                                      y: yComponent,
                                      width: frame!.width,
                                      height: frame!.height)
        })
    }

    // MARK: - UI
    private func setupStyle() {
        labelWorkingHours.textColor = R.color.green()
        buttonRoute.setTitleColor(R.color.blue(),
                                  for: .normal)
    }

    private func bindViewModel() {
        viewModel.output.name
            .bind(to: lblName.rx.text)
            .disposed(by: disposeBag)
        viewModel.output.address
            .bind(to: lblAddress.rx.text)
            .disposed(by: disposeBag)
        viewModel.output.cityCounty
            .bind(to: lblCityCounty.rx.text)
            .disposed(by: disposeBag)
        viewModel.output.workingHours
            .bind(to: labelWorkingHours.rx.text)
            .disposed(by: disposeBag)
    }

    // MARK: - Actions
    @IBAction func buttonRouteOnClick(_ sender: Any) {
        viewModel.input.action.onNext(.tappedRoute)
    }

}
