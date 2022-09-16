public class MVCCompress {
    CompressView theView = new CompressView();
    CompressModel theModel = new CompressModel();
    CompressController theController = new CompressController(theView, theModel);
        theView.setVisible(true);
}
