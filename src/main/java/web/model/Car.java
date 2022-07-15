package web.model;

public class Car {
    private Long id;
    private String manuf;
    private String series;

    public Car () {}

    public Car(Long id, String manuf, String series) {
        this.id = id;
        this.manuf = manuf;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }
}
