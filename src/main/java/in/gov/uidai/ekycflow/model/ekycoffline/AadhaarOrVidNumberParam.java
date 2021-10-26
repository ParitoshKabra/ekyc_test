package in.gov.uidai.ekycflow.model.ekycoffline;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AadhaarOrVidNumberParam {
    private long aadhaarOrVidNumber;
    private String txnNumber;
    private String shareCode;
    private String otp;
    private String deviceId;
    private String transactionId;
    private String unifiedAppRequestTxnId;
    private String uid;
    private String vid;

    public void setTxnNumber(String txnNumber) {
        this.txnNumber = txnNumber;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
