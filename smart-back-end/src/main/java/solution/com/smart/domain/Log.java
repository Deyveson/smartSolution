package solution.com.smart.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Log {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "request")
    private String request;

    @Column(name = "status")
    private String status;

    @Column(name = "user_agent ")
    private String user_agente;

    public Log(Long id, Date date, String request, String status, String user_agente) {
        this.id = id;
        this.date = date;
        this.request = request;
        this.status = status;
        this.user_agente = user_agente;
    }

    public Log() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_agente() {
        return user_agente;
    }

    public void setUser_agente(String user_agente) {
        this.user_agente = user_agente;
    }
}
