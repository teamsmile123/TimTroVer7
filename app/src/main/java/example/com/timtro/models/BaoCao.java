package example.com.timtro.models;

/**
 * Created by Administrator on 23/09/2017.
 */

public class BaoCao {
    private String title;
    private String detail;

    public BaoCao(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
