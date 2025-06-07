import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrearArchivo {
    List<Consulta> consultas = new ArrayList<>();
    private static final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public Consulta JsonToConsulta(String json) throws IOException {
        try {
            Consulta consulta = gson.fromJson(json, Consulta.class);
            return consulta;
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Error parseando JSON: " + e.getMessage(), e);
        }
    }
    public void GuardarEnJson(Consulta consulta) throws IOException {
        consultas.add(consulta);
        FileWriter escritura = new FileWriter("consultas.json");
        escritura.write(gson.toJson(consultas));
        escritura.close();
    }
}
