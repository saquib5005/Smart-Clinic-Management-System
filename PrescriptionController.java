@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping
    public ResponseEntity<String> savePrescription(
            @RequestBody Prescription prescription,
            @RequestHeader("Authorization") String token) {

        if (!tokenService.isValid(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
        }

        prescriptionService.save(prescription);
        return ResponseEntity.ok("Prescription saved successfully");
    }
}
