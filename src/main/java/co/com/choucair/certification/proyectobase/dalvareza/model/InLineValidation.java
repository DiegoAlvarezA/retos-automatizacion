package co.com.choucair.certification.proyectobase.dalvareza.model;

public class InLineValidation {
    private String required;
    private String email;
    private String password;
    private String confirmPassword;
    private String date;
    private String url;
    private String minimumChars;
    private String maximumChars;
    private String minimum;
    private String maximum;
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

    public String getMinimumChars() {
        return minimumChars;
    }

    public void setMinimumChars(String minimumChars) {
        this.minimumChars = minimumChars;
    }

    public String getMaximumChars() {
        return maximumChars;
    }

    public void setMaximumChars(String maximumChars) {
        this.maximumChars = maximumChars;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public boolean isAgreeToPolicy() {
        return isAgreeToPolicy;
    }

    public void setAgreeToPolicy(boolean agreeToPolicy) {
        isAgreeToPolicy = agreeToPolicy;
    }
}
