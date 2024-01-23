package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminEasyPage {

    public AdminEasyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //All Requests Page
    @FindBy(className = "page-title") public WebElement textSupportRequest;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement linkFirstSubject;
    @FindBy(xpath = "//tr[1]/td[2]") public WebElement linkFirstSubmittedBy;
    @FindBy(xpath = "(//*[@class='las la-desktop'])[1]") public WebElement buttonFirstAction;

    //Pending Requests Page
    @FindBy(className = "page-title") public WebElement textPendingRequests;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement linkPendingFirstSubject;
    @FindBy(xpath = "//tr[1]/td[2]") public WebElement linkPendingFirstSubmittedBy;
    @FindBy(xpath = "(//*[@class='las la-desktop'])[1]") public WebElement buttonPendingFirstAction;

    //Closed Requests Page
    @FindBy(className = "page-title") public WebElement textClosedRequests;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement linkClosedFirstSubject;
    @FindBy(xpath = "//tr[1]/td[2]") public WebElement linkClosedFirstSubmittedBy;
    @FindBy(xpath = "(//*[@class='las la-desktop'])[1]") public WebElement buttonClosedFirstAction;

    //Answered Requests Page
    @FindBy(className = "page-title") public WebElement textAnsweredRequests;


    //Seat Layouts Page
    @FindBy(className = "page-title") public WebElement textSeatLayouts;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement textSeatFirstSN;
    @FindBy(xpath = "//tr[1]/td[2]") public WebElement textSeatFirstLayout;
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small.addBtn") public WebElement buttonSeatAddNew;
    @FindBy(xpath = "(//*[@class='modal-title'])[1]") public WebElement textAddSeatLayouts;
    @FindBy(xpath = "(//input[@type='text'])[1]") public WebElement textBoxLayout;
    @FindBy(xpath = "(//button[@type='button'])[14]") public WebElement buttonCancelAddSeatLayout;
    @FindBy(xpath = "(//button[@type='submit'])[2]") public WebElement buttonSaveAddSeatLayout;

    //Fleet Type Page
    @FindBy(className = "page-title") public WebElement textFleetType;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement textFleetExpressBus;
    @FindBy(xpath = "//tr[2]/td[1]") public WebElement textFleetClassicBus;
    @FindBy(xpath = "//tr[3]/td[1]") public WebElement textFleetLuxBus;
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small.addBtn") public WebElement buttonFleetAddNew;
    @FindBy(xpath = "(//*[@class='modal-title'])[1]") public WebElement textAddFleetType;
    @FindBy(xpath = "(//*[@placeholder='Enter Fleet Name'])[1]") public WebElement textBoxFleetName;
    @FindBy(xpath = "(//*[@name='seat_layout'])[1]") public WebElement dropDownSeatLayout;
    @FindBy(xpath = "(//*[@title='Öğeyi kaldırmak'])[1]") public WebElement iconDeleteCayKahve;
    @FindBy(xpath = "(//*[@title='Öğeyi kaldırmak'])[2]") public WebElement iconDeleteSu;
    @FindBy(xpath = "(//*[@title='Öğeyi kaldırmak'])[3]") public WebElement iconDeleteYastik;
    @FindBy(xpath = "(//*[@title='Öğeyi kaldırmak'])[4]") public WebElement iconDeleteWifi;
    @FindBy(xpath = "(//*[@class='btn btn--success toggle-on'])[1]") public WebElement buttonAc;
    @FindBy(xpath = "(//*[@class='toggle btn btn--danger off'])[1]") public WebElement buttonNonAc;
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[1]") public WebElement buttonClose;
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[1]") public WebElement buttonSave;

    //Route Page
    @FindBy(className = "page-title") public WebElement textAllRoutes;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement textFirstName;
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small.addBtn") public WebElement buttonRouteAddNew;
    @FindBy(xpath = "(//*[@class='la la-pen'])[1]") public WebElement iconPenFirstAction;
    @FindBy(css = ".card-title.border-bottom.pb-2") public WebElement textInformationOfRoute;
    @FindBy(xpath = "//*[@placeholder='Enter Name']") public WebElement textBoxName;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[1]") public WebElement dropDownStartFrom;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]") public WebElement dropDownEndTo;
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement Austin;
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement Dallas;
    @FindBy(xpath = "(//*[@role='option'])[4]") public WebElement ForthWorth;
    @FindBy(xpath = "(//*[@role='option'])[5]") public WebElement Houston;
    @FindBy(xpath = "(//*[@role='option'])[6]") public WebElement Lousiana;
    @FindBy(xpath = "(//*[@role='option'])[7]") public WebElement SanAntonio;
    @FindBy(xpath = "(//*[@role='option'])[8]") public WebElement Memphis;
    @FindBy(xpath = "(//*[@role='option'])[9]") public WebElement Nashville;
    @FindBy(xpath = "(//*[@role='option'])[10]") public WebElement Atlanta;
    @FindBy(xpath = "//*[@for='has-stoppage']") public WebElement radioButtonHasMoreStoppage;
    @FindBy(xpath = "(//*[@role='presentation'])[5]") public WebElement dropdownOneSelectStoppage;
    @FindBy(xpath = "(//*[@class='las la-times'])[3]") public WebElement iconXOneDropdown;
    @FindBy(xpath = "(//*[@role='presentation'])[7]") public WebElement dropdownTwoSelectStoppage;
    @FindBy(xpath = "(//*[@class='las la-times'])[4]") public WebElement iconXTwoDropdown;
    @FindBy(xpath = "(//*[@class='form-control'])[2]") public WebElement textBoxTime;
    @FindBy(xpath = "(//*[@class='form-control'])[3]") public WebElement textBoxDistance;
    @FindBy(xpath = "(//*[@type='submit'])[2]") public WebElement buttonSaveChanges;
    @FindBy(xpath = "//*[text()='Go Back']") public WebElement buttonGoBack;
    @FindBy(xpath = "(//*[@class='la la-eye-slash'])[1]") public WebElement iconEyeFirstAction;
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[2]") public WebElement buttonCloseDisable;
    @FindBy(xpath = "//*[@class='btn btn--danger']") public WebElement buttonDisable;

    //Schedule page
    @FindBy(className = "page-title") public WebElement textAllSchedules;
    @FindBy(xpath = "//tr[1]/td[1]") public WebElement textFirstStartFrom;
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small.addBtn") public WebElement buttonScheduleAddNew;
    @FindBy(xpath = "(//*[@class='modal-title'])[1]") public WebElement textAddSchedule;
    @FindBy(xpath = "(//*[@class='form-control'])[1]") public WebElement textBoxStartFromAdd;
    @FindBy(xpath = "(//*[@class='form-control'])[2]") public WebElement textBoxEndAtAdd;
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[1]") public WebElement buttonCloseAddSchedule;
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[1]") public WebElement buttonSaveAddSchedule;
    @FindBy(xpath = "(//*[@class='la la-pen'])[1]") public WebElement iconPenFirst;
    @FindBy(xpath = "(//*[@class='modal-title'])[2]") public WebElement textUpdateSchedule;
    @FindBy(xpath = "(//*[@class='form-control'])[3]") public WebElement textBoxStartFromUpdate;
    @FindBy(xpath = "(//*[@class='form-control'])[4]") public WebElement textBoxEndAt;
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[2]") public WebElement buttonCloseUpdateSchedule;
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[2]") public WebElement buttonUpdate;
    @FindBy(xpath = "(//*[@class='la la-eye'])[1]") public WebElement iconEyeFirst;
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[2]") public WebElement buttonCloseActiveSchedule;
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[3]") public WebElement buttonActive;
    @FindBy(xpath = "(//*[@class='page-link'])[2]") public WebElement iconSecondPage;
    @FindBy(xpath = "(//*[@class='page-link'])[3]") public WebElement iconThirdPage;
    @FindBy(xpath = "(//*[@class='page-link'])[4]") public WebElement iconFourthPage;

    //Ticket Price Page
    @FindBy(className = "page-title") public WebElement textAllTicketPrice;
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small") public WebElement buttonAddNewTicketPrice;
    @FindBy(css = ".card-title.border-bottom.pb-2") public WebElement textInformationAboutTicketPrice;
    @FindBy(xpath = "(//*[@role='presentation'])[1]") public WebElement dropdownFleetType;
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement optionLuxBus;
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement optionClassicBus;
    @FindBy(xpath = "(//*[@role='option'])[4]") public WebElement optionExpressBus;
    @FindBy(xpath = "(//*[@role='presentation'])[3]") public WebElement dropdownRoute;

    //Ticket Price Page >> AddNew Button >> Route Dropdown==> Express->Houston->Memphis
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement optionExpressHoustonMemphis;

    //Ticket Price Page >> AddNew Button >> Route Dropdown==> Express->Lousiana->Nashville
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement optionExpressLousianaNashville;

    //Ticket Price Page >> AddNew Button >> Route Dropdown==> Express->SanAntonio->Lousiana
    @FindBy(xpath = "(//*[@role='option'])[4]") public WebElement optionExpressSanAntonioLousiana;

    //Ticket Price Page >> AddNew Button >> Route Dropdown==> Mehphis->Oklahoma->CityAtlanta
    @FindBy(xpath = "(//*[@role='option'])[5]") public WebElement optionMehphisOklahomaCityAtlanta;

    //Ticket Price Page >> AddNew Button >> Route Dropdown==> Mehphis->Lousiana->Houston
    @FindBy(xpath = "(//*[@role='option'])[6]") public WebElement optionMemphisLousianaHouston;

    //Ticket Price Page >> AddNew Button >> Route Dropdown==> Houston->Lousiana->Memphis
    @FindBy(xpath = "(//*[@role='option'])[7]") public WebElement optionHoustonLousianaMemphis;

    //Ticket Price Page >> AddNew Button >> Price For Source To Destination TextBox
    @FindBy(xpath = "//*[@placeholder='Enter a price']") WebElement textBoxPriceForSourceToDestination;

    //Ticket Price Page >> AddNew Button >> Save Button
    @FindBy(xpath = "(//*[@type='submit'])[2]") WebElement ButtonSave;

    //Ticket Price Page >> AddNew Button >> GoBack Button
    @FindBy(xpath = ".la.la-fw.la-backward") public WebElement ButtonGoBack;

    //Ticket Price Page >> First Row on the Table >> Icon Pen
    @FindBy(xpath = "(//*[@class='la la-pen'])[1]") public WebElement iconPenFirstTicketPrice;

    //Ticket Price Page >> First Row on the Table >> Icon Pen >> Price TextBox
    @FindBy(id = "point-1") public WebElement textBoxPrice;

    //Ticket Price Page >> First Row on the Table >> Icon Pen >> Update Button
    @FindBy(xpath = "(//*[@type='submit'])[2]") public WebElement ButtonUpdate;

    //Ticket Price Page >> First Row on the Table >> Icon Delete
    @FindBy(xpath = "(//*[@type='button'])[7]") public WebElement iconDeleteFirstTicketPrice;

    //Ticket Price Page >> Second Page Icon
    @FindBy(xpath = "(//*[@class='page-link'])[2]") public WebElement iconSecondPageTicketPrice;

    //Trip Page >> Text >> All Trip
    @FindBy(className = "page-title") public WebElement textAllTrip;

    //Trip Page >> AddNew Button
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small") public WebElement buttonAddNewTrip;

    //Trip Page >> First Row on the Table >> Icon Pen
    @FindBy(xpath = "(//*[@class='la la-pen'])[1]") public WebElement iconPenFirstTrip;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Title TextBox
    @FindBy(xpath = "(//*[@class='form-control'])[1]") public WebElement textBoxTitle;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window>> Fleet Type Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[1]") public WebElement dropdownFleet;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Fleet Type Dropdown-LuxBus
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement LuxBus;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Fleet Type Dropdown-ClassicBus
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement ClassicBus;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Fleet Type Dropdown-ExpressBus
    @FindBy(xpath = "(//*[@role='option'])[4]") public WebElement ExpressBus;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[3]") public WebElement routeDropdown;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown==> Express->Houston->Memphis
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement ExpressHoustonMemphis;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown==> Express->Lousiana->Nashville
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement ExpressLousianaNashville;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown==> Express->SanAntonio->Lousiana
    @FindBy(xpath = "(//*[@role='option'])[4]") public WebElement ExpressSanAntonioLousiana;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown==> Mehphis->Oklahoma->CityAtlanta
    @FindBy(xpath = "(//*[@role='option'])[5]") public WebElement MehphisOklahomaCityAtlanta;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown==> Mehphis->Lousiana->Houston
    @FindBy(xpath = "(//*[@role='option'])[6]") public WebElement MemphisLousianaHouston;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Route Dropdown==> Houston->Lousiana->Memphis
    @FindBy(xpath = "(//*[@role='option'])[7]") public WebElement HoustonLousianaMemphis;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Schedule Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[6]") public WebElement dropDownSchedule;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Schedule Dropdown==>05:45 am - 10:10 am
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement optionSchedule1;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Schedule Dropdown==>05:45 am - 06:25 am
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement optionSchedule2;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[8]") public WebElement dropdownStartFrom;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> End To Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[10]") public WebElement dropdownEndTo;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Austin
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement optionAustin;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Dallas
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement optionDallas;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Forth Worth
    @FindBy(xpath = "(//*[@role='option'])[4]") public WebElement optionForthWorth;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Houston
    @FindBy(xpath = "(//*[@role='option'])[5]") public WebElement optionHouston;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Lousiana
    @FindBy(xpath = "(//*[@role='option'])[6]") public WebElement optionLousiana;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-San Antonio
    @FindBy(xpath = "(//*[@role='option'])[7]") public WebElement optionSanAntonio;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Memphis
    @FindBy(xpath = "(//*[@role='option'])[8]") public WebElement optionMemphis;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Nashville
    @FindBy(xpath = "(//*[@role='option'])[9]") public WebElement optionNashville;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Start From && End To Dropdown-Atlanta
    @FindBy(xpath = "(//*[@role='option'])[10]") public WebElement optionAtlanta;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Day Of Dropdown
    @FindBy(xpath = "(//*[@role='combobox'])[6]") public WebElement dropDownDayOf;

    //Trip Page >> AddNew Button-Icon Pen >>Add Trip-Update Trip Window >> Close Button
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[1]") public WebElement ButtonCloseTrip;

    //Trip Page >> AddNew Button >> Save Button
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[1]") public WebElement ButtonSaveTrip;

    //Trip Page >> Icon Pen >> Update Button
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[3]") public WebElement ButtonUpdateTrip;

    //Trip Page >> First Row on the Table >> Icon Eye
    @FindBy(xpath = "(//*[@class='la la-eye-slash'])[1]") public WebElement IconEyeFirstRow;

    //Trip Page >> First Row on the Table >> Icon Eye >> Disable Button
    @FindBy(xpath = "//*[@class='btn btn--danger']") public WebElement disableButton;

    //Trip Page >> First Row on the Table >> Icon Eye >> Close Button
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[4]") public WebElement closeButton;

    //Assigned Vehicle Page
    @FindBy(className = "page-title") public WebElement textAssignedVehicles;
    @FindBy(css = ".btn.btn-sm.btn--primary.box--shadow1.text--small.addBtn") public WebElement buttonAssignedAddVehicle;

    //Assigned Vehicle Page >> First Row on the Table >> Icon Pen
    @FindBy(xpath = "(//*[@class='la la-pen'])[1]") public WebElement penIconFirstAction;

    //Assigned Vehicle Page >> Icon Pen >> Trip Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[6]") public WebElement DropdownTrip;

    //Assigned Vehicle Page >> Icon Pen >> Trip Dropdown==>LUX BUS - Fort Worth - Dallas
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement optionLuxBusForthWorthDallas;

    //Assigned Vehicle Page >> Icon Pen >> Trip Dropdown==>LUX BUS - Austin - Fort Worth
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement optionLuxBusAustinForthWorth;

    //Assigned Vehicle Page >> Icon Pen >> Vehicle Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[8]") public WebElement DropdownVehicle;

    //Assigned Vehicle Page >> Icon Pen >> Vehicle Dropdown==> EBT-002 (EBT-002)
    @FindBy(xpath = "(//*[@role='option'])[2]") public WebElement optionEBT002;

    //Assigned Vehicle Page >> Icon Pen >> Vehicle Dropdown==> EBT-004 (EBT-004)
    @FindBy(xpath = "(//*[@role='option'])[3]") public WebElement optionEBT004;

    //Assigned Vehicle Page >> Icon Pen >> Close Button
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[2]") public WebElement buttonCloseIconPen;

    //Assigned Vehicle Page >> Icon Pen >> Update Button
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[3]") public WebElement buttonUpdateIconPen;

    //Assigned Vehicle Page >> AddNew Button >> Trip Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[2]") public WebElement dropdownTripAssignedPage;

    //Assigned Vehicle Page >> AddNew Button >> Vehicle Dropdown
    @FindBy(xpath = "(//*[@role='presentation'])[4]") public WebElement dropdownVehicle;

    //Assigned Vehicle Page >> AddNew Button >> Close Button
    @FindBy(xpath = "(//*[@class='btn btn--dark'])[1]") public WebElement buttonCloseAddNew;

    //Assigned Vehicle Page >> AddNew Button >> Save Button
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[1]") public WebElement buttonSaveAddNew;

}
