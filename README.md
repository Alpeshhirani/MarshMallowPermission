# MarshMallowPermission
The easiest way to handle android runtime permissions.

MarshMallowPermission marshMallowPermission;

@Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            
        marshMallowPermission = new MarshMallowPermission(this);
         if (!marshMallowPermission.checkPermissionForReadPhoneState()) {      
              marshMallowPermission.requestPermissionForReadPhoneState();
             //Request Permission
                } else {
                //Already allow Permission
                //Code Here
                }
}


 @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MarshMallowPermission.READ_PHONE_STATE_CODE:

                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //Allow Permission
                }else{
                    //Denied Permission
                }

                break;
        }
    }
