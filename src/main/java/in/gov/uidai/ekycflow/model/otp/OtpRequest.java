package in.gov.uidai.ekycflow.model.otp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OtpRequest {
    private String uidNumber;
    private String captchaTxnId;
    private String captchaValue;
    private String transactionId;

    public String getCaptchaTxnId() {
        return captchaTxnId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCaptchaValue() {
        return captchaValue;
    }

    public String getUidNumber() {
        return uidNumber;
    }

    public void setUidNumber(String uidNumber) {
        this.uidNumber = uidNumber;
    }

    public void setCaptchaTxnId(String captchaTxnId) {
        this.captchaTxnId = captchaTxnId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setCaptchaValue(String captchaValue) {
        this.captchaValue = captchaValue;
    }
}
