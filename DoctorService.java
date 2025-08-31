@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepo;

    public List<LocalTime> getAvailableSlots(Long doctorId, LocalDate date) {
        // Logic to return available time slots
        return List.of(LocalTime.of(9,0), LocalTime.of(10,0));
    }

    public boolean validateDoctorLogin(String email, String password) {
        Doctor doctor = doctorRepo.findByEmail(email).orElse(null);
        return doctor != null && doctor.getPassword().equals(password);
    }
}
