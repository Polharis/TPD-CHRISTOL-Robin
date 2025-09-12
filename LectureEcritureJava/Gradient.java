public class Gradient {
    public static void main(String[] args) {
        Image img = new Image(200, 100);
        int l = img.getWidth();
        int h = img.getHeight();
        // Génération du dégradé de bleu
        for (int y = 0; y < l; y++) {
            for (int x = 0; x < h; x++) {
                int bleu = 0; // quel calcule ?
                img.setPixel(x, y, 0, 0, bleu);
            }
        }

        try {
            Image.save_txt("gradient.ppm");
            System.out.println("Dégradé créé avec succès !");
        } catch (Exception e) {
            System.err.println("Erreur lors de la création du dégradé : " + e.getMessage());
        }
    }
}
