package kelasi.ac.za.kelasi_api.domain.lecture;

public class LectureInstitution
{
    private String email, subject, description, institution, date;


    private LectureInstitution(){}

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDate() {
        return date;
    }


    public LectureInstitution(Builder builder){
        this.description = builder.description;
        this.institution = builder.institution;
        this.subject = builder.subject;
        this.email = builder.email;
        this.date = builder.date;
    }

    public static class Builder
    {
        private String email, subject, description, institution, date;

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder institution(String institution){
            this.institution = institution;
            return this;
        }

        public Builder subject(String subject){
            this.subject = subject;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder date(String date){
            this.date = date;
            return this;
        }


        public LectureInstitution build(){
            return new LectureInstitution(this);
        }
    }

    @Override
    public String toString() {
        return "LectureInstitution{" + "email='" + email + '\'' + ", " +
                "subject='" + subject + '\'' + ", description='" + description + '\'' + "," +
                " institution='" + institution + '\'' + ", date='" + date + '\'' + '}';
    }
}
