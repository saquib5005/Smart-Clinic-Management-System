@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String specialization;

    @ElementCollection
    private List<LocalTime> availableTimes;

    // Getters and Setters
}
