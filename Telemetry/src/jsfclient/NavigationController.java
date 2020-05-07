package jsfclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name="navigationController", eager=true)
@RequestScoped
public class NavigationController implements Serializable {
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    //condional navigation based on pageId
    //if pageId is 1 show page1.xhtml,
    //if pageId is 2 show page2.xhtml
    //else show home.xhtml

    public String showPage() {
        if(pageId == null) {
            return "index";
        }

        if(pageId.equals("1")) {
            return "carsBean";
        }else if(pageId.equals("2")) {
            return "carBean?carId=1";
        }else {
            return "index";
        }
    }

    public String showPage(int id) {
        if(pageId == null) {
            return "index";
        }
        System.out.println(id);
        if(pageId.equals("1")) {
            return "carsBean";
        }else if(pageId.equals("2")) {
            return "carBean?carId=1";
        }else {
            return "index";
        }
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
