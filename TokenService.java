@Service
public class TokenService {
    private String secret = "your-secret-key";

    public String generateToken(String email) {
        return Jwts.builder()
                   .setSubject(email)
                   .signWith(SignatureAlgorithm.HS256, secret)
                   .compact();
    }

    public Key getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
}
