package in.gov.uidai.ekycflow.model.ekycoffline;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class OfflineEkycXMLResponse implements Serializable {
    private static final long serialVersionUID = 6449564989990671308L;

    private String eKycXML;
    private String fileName;
    private String status;
    private LocalDate requestDate;
    private String uidNumber;

    public String geteKycXML() {
        return eKycXML;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUidNumber(String uidNumber) {
        this.uidNumber = uidNumber;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getUidNumber() {
        return uidNumber;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileName() {
        return fileName;
    }

    public String getStatus() {
        return status;
    }

    public void seteKycXML(String eKycXML) {
        this.eKycXML = eKycXML;
    }
}
