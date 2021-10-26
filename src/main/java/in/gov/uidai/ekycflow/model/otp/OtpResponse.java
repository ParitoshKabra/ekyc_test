package in.gov.uidai.ekycflow.model.otp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OtpResponse {
    private String uidNumber;
    private String mobileNumber;
    private String txnId;
    private String status; //Success/Failure
    private String message;

    public void setUidNumber(String uidNumber) {
        this.uidNumber = uidNumber;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getStatus() {
        return status;
    }

    public String getTxnId() {
        return txnId;
    }

    public String getUidNumber() {
        return uidNumber;
    }

    public String getMessage() {
        return message;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
