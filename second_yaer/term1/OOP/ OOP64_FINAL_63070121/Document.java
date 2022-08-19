
import java.io.Serializable;

public class Document  implements Serializable {
    private String title;
    private String detail;
    private String type;
    public Document(){
        this("", "", "");
    }

    public Document(String title, String detail, String type) {
        this.title = title;
        this.detail = detail;
        this.type = type;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
