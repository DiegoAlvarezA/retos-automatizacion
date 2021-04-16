package co.com.choucair.certification.proyectobase.dalvareza.model;

public class BlockValidation {

    private String required;
    private String email;
    private String password;
    private String confirmPassword;
    private String date;
    private String url;
    private String digits;
    private String range;
    private boolean isAgreeToPolicy;

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isAgreeToPolicy() {
        return isAgreeToPolicy;
    }

    public void setAgreeToPolicy(boolean agreeToPolicy) {
        isAgreeToPolicy = agreeToPolicy;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
