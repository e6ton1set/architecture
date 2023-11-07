package lesson8;

import lesson8.Models.TableModel;
import lesson8.Presenters.BookingPresenter;
import lesson8.Presenters.Model;
import lesson8.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Руслан");
        view.changeReservationTable(1001, new Date(), 2, "Руслан");
    }

}
