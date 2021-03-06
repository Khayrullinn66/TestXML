
/*
import org.xml.sax.SAXException;
import org.apache.log4j.logger;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XmlValidator {

    private static final System.Logger log = System.Logger.getLogger(XmlValidator.class);

    public void validate(String fileName, String schemaName){

        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);

        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);


            log.info("Document is valid!");

        } catch (SAXException e) {
            log.error("Validation error. "+ e.getMessage());
        } catch (IOException e) {
            log.error("File is not valid. " + e.getMessage());
        }


    }

}*/
