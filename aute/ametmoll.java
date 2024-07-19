    import com.example.jknack.handlebars.Handlebars;
    import com.example.jknack.handlebars.Template;
    import com.example.jknack.handlebars.io.ClassPathTemplateLoader;
    import com.example.jknack.handlebars.io.TemplateLoader;

    import java.io.IOException;
    import java.util.HashMap;
    import java.util.Map;

    public class HandlebarsExample {
        public static void main(String[] args) {
            // Create a TemplateLoader that loads templates from the classpath
            TemplateLoader loader = new ClassPathTemplateLoader("/templates", ".hbs");
            Handlebars handlebars = new Handlebars(loader);

            try {
                // Compile the template
                Template template = handlebars.compile("example");

                // Data to be passed into the template
                Map<String, Object> data = new HashMap<>();
                data.put("name", "World");

                // Apply the data to the template
                String result = template.apply(data);

                // Print the result
                System.out.println(result);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    