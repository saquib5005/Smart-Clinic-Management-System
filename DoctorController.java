@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/availability")
    public ResponseEntity<List<LocalTime>> getAvailability(
            @RequestParam Long doctorId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestHeader("Authorization") String token) {

        if (!tokenService.isValid(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        List<LocalTime> slots = doctorService.getAvailableSlots(doctorId, date);
        return ResponseEntity.ok(slots);
    }
}
