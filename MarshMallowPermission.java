package com.presentmaam.xitix.Activity;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;


public class MarshMallowPermission1 {

    public static final int READ_CALENDAR_CODE = 1;
    public static final int WRITE_CALENDAR_CODE = 2;
    public static final int CAMERA_CODE = 3;
    public static final int READ_CONTACTS_CODE = 4;
    public static final int WRITE_CONTACTS_CODE = 5;
    public static final int GET_ACCOUNT_CODE = 6;
    public static final int ACCESS_FINE_LOCATION_CODE = 7;
    public static final int ACCESS_COARSE_LOCATION_CODE = 8;
    public static final int RECORD_AUDIO_CODE = 9;
    public static final int READ_PHONE_STATE_CODE = 10;
    public static final int CALL_PHONE__CODE = 11;
    public static final int READ_CALL_LOG_CODE = 12;
    public static final int WRITE_CALL_LOG_CODE = 13;
    public static final int ADD_VOICE_MAIL_CODE = 14;
    public static final int USE_SIP_CODE = 15;
    public static final int PROCESS_OUTGOING_CALL_CODE = 16;
    public static final int BODY_SENSOR_CODE = 17;
    public static final int SEND_SMS_CODE = 18;
    public static final int RECEIVE_SMS_CODE = 19;
    public static final int READ_SMS_CODE = 20;
    public static final int RECEIVE_WAP_PUSH_CODE = 21;
    public static final int RECEIVE_MMS_CODE = 22;
    public static final int READ_EXTERNAL_STORAGE_CODE = 23;
    public static final int WRITE_EXTERNAL_STORAGE_CODE = 24;

    Activity activity;

    public MarshMallowPermission1(Activity activity) {
        this.activity = activity;
    }

    public boolean checkPermissionForReadCalender() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALENDAR);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteCalender() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALENDAR);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForCamera() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CAMERA);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadContacts() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CONTACTS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteContacts() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CONTACTS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForGetAccount() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.GET_ACCOUNTS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForAccessFineLocation() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForAccessCoarseLocation() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForRecordAudio() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadPhoneState() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_PHONE_STATE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForCallPhone() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadCallLog() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALL_LOG);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteCallLog() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALL_LOG);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForAddVoiceMail() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ADD_VOICEMAIL);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForUseSip() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.USE_SIP);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForProcessOutGoingCall() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.PROCESS_OUTGOING_CALLS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForBodySensor() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.BODY_SENSORS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForSendSms() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.SEND_SMS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReceiveSms() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_SMS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadSms() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_SMS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReceiveWapPush() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_WAP_PUSH);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReceiveMms() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_MMS);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadexternal() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteexternal() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }


    public void requestPermissionForReadCalender() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CALENDAR)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALENDAR}, READ_CALENDAR_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALENDAR}, READ_CALENDAR_CODE);
        }
    }

    public void requestPermissionForWriteCalender() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_CALENDAR)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALENDAR}, WRITE_CALENDAR_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALENDAR}, WRITE_CALENDAR_CODE);
        }
    }

    public void requestPermissionForCamera() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CAMERA)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA}, CAMERA_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA}, CAMERA_CODE);
        }
    }

    public void requestPermissionForReadContacts() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CONTACTS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CONTACTS}, READ_CONTACTS_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CONTACTS}, READ_CONTACTS_CODE);
        }
    }

    public void requestPermissionForWriteContacts() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_CONTACTS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CONTACTS}, WRITE_CONTACTS_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CONTACTS}, WRITE_CONTACTS_CODE);
        }
    }

    public void requestPermissionForGetAccount() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.GET_ACCOUNTS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.GET_ACCOUNTS}, GET_ACCOUNT_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.GET_ACCOUNTS}, GET_ACCOUNT_CODE);
        }
    }

    public void requestPermissionForAccessFineLocation() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.ACCESS_FINE_LOCATION)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, ACCESS_FINE_LOCATION_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, ACCESS_FINE_LOCATION_CODE);
        }
    }

    public void requestPermissionForAccessCoarseLocatio() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.ACCESS_COARSE_LOCATION)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, ACCESS_COARSE_LOCATION_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, ACCESS_COARSE_LOCATION_CODE);
        }
    }

    public void requestPermissionForRecordAudio() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECORD_AUDIO)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_AUDIO_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_AUDIO_CODE);
        }
    }

    public void requestPermissionForReadPhoneState() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_PHONE_STATE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_PHONE_STATE}, READ_PHONE_STATE_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_PHONE_STATE}, READ_PHONE_STATE_CODE);
        }
    }

    public void requestPermissionForCallPhone() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE}, CALL_PHONE__CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE}, CALL_PHONE__CODE);
        }
    }

    public void requestPermissionForReadCallLog() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CALL_LOG)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALL_LOG}, READ_CALL_LOG_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALL_LOG}, READ_CALL_LOG_CODE);
        }
    }

    public void requestPermissionForWriteCallLog() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_CALL_LOG)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALL_LOG}, WRITE_CALL_LOG_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALL_LOG}, WRITE_CALL_LOG_CODE);
        }
    }

    public void requestPermissionForAddVoiceMail() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.ADD_VOICEMAIL)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ADD_VOICEMAIL}, ADD_VOICE_MAIL_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ADD_VOICEMAIL}, ADD_VOICE_MAIL_CODE);
        }
    }

    public void requestPermissionForUseSip() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.USE_SIP)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.USE_SIP}, USE_SIP_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.USE_SIP}, USE_SIP_CODE);
        }
    }

    public void requestPermissionForProcessOutGoingCall() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.PROCESS_OUTGOING_CALLS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS}, PROCESS_OUTGOING_CALL_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS}, PROCESS_OUTGOING_CALL_CODE);
        }
    }

    public void requestPermissionForBodySensor() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.BODY_SENSORS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.BODY_SENSORS}, BODY_SENSOR_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.BODY_SENSORS}, BODY_SENSOR_CODE);
        }
    }

    public void requestPermissionForSendSms() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.SEND_SMS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_CODE);
        }
    }

    public void requestPermissionForReceiveSms() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECEIVE_SMS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_SMS}, RECEIVE_SMS_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_SMS}, RECEIVE_SMS_CODE);
        }
    }

    public void requestPermissionForReadSms() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_SMS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_SMS}, READ_SMS_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_SMS}, READ_SMS_CODE);
        }
    }

    public void requestPermissionForReceiveWapPush() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECEIVE_WAP_PUSH)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_WAP_PUSH}, RECEIVE_WAP_PUSH_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_WAP_PUSH}, RECEIVE_WAP_PUSH_CODE);
        }
    }

    public void requestPermissionForReceiveMms() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECEIVE_MMS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_MMS}, RECEIVE_MMS_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_MMS}, RECEIVE_MMS_CODE);
        }
    }

    public void requestPermissionForWriteexternal() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXTERNAL_STORAGE_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXTERNAL_STORAGE_CODE);
        }
    }

}
