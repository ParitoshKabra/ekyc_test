package in.gov.uidai.ekycflow.model.captcha;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CaptchaResponse {
    private String status;
    private String captchaBase64String;
    private String captchaTxnId;
    private String requestedDate;
    private int statusCode;
    private String message;

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public String getCaptchaTxnId() {
        return captchaTxnId;
    }

    public String getCaptchaBase64String() {
        return captchaBase64String;
    }
}
