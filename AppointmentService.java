@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepo;

    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDate date) {
        return appointmentRepo.findByDoctorAndDate(doctorId, date);
    }
}
