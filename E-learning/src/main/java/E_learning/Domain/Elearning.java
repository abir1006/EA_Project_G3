package E_learning.Domain;

public class Elearning {
    private String courseName;
    private String courseDescription;
    private String courseDuration;
    private String coursePrice;

    public Elearning(String courseName, String courseDescription, String courseDuration, String coursePrice) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public String getCoursePrice() {
        return coursePrice;
    }
}
