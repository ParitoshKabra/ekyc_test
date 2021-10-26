package in.gov.uidai.ekycflow.model.captcha;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CaptchaRequest {
    private String langCode;
    private String captchaLength;
    private String captchaType;

    public void setCaptchaLength(String captchaLength) {
        this.captchaLength = captchaLength;
    }

    public String getCaptchaLength() {
        return captchaLength;
    }

    public String getLangCode() {
        return langCode;
    }

    public String getCaptchaType() {
        return captchaType;
    }

    public void setCaptchaType(String captchaType) {
        this.captchaType = captchaType;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
}
