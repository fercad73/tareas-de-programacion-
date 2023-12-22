public class PhishDetector {

    private static final String[] keywords = {
        "urgente",
        "importante",
        "verificación",
        "cuenta",
        "acceso",
        "información",
        "contraseña",
        "tarjeta de crédito",
        "número de seguro social",
        "su cuenta ha sido bloqueada",
        "su cuenta ha sido comprometida",
        "su información personal está en riesgo",
        "haga clic aquí para actualizar su información",
        "haga clic aquí para verificar su cuenta",
        "Banco Popular",
        "Banco Guayaquil",
        "Banco Pichincha",
        "Diners Club",
        "MasterCard",
        "Visa",
        "Amazon",
        "eBay",
        "Facebook"
    };

    private static final int SCORE_URGENT = 3;
    private static final int SCORE_IMPORTANTE = 3;
    private static final int SCORE_VERIFICACION = 2;
    private static final int SCORE_CUENTA = 1;
    private static final int SCORE_ACCESO = 1;
    private static final int SCORE_INFORMACION = 1;
    private static final int SCORE_CONTRASENA = 2;
    private static final int SCORE_TARJETA_CREDITO = 2;
    private static final int SCORE_NUMERO_SEGURO_SOCIAL = 2;

    public PhishDetector() {
    }

    public void loadKeywords() {
    }

    public void scanFile(String filename) throws IOException {
        FileInputStream inputStream = new FileInputStream(filename);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        int score = 0;
        int count = 0;

        String line;
        while
