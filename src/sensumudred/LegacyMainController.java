package sensumudred;

import Udred.Data.DbContract;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import Udred.Data.PostgresHelper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class LegacyMainController {
    @FXML
    private Button btnConnectToDatabase;
    @FXML
    private TextArea txtInfoBox;



    public void ClickBtnConnection()
    {
        PostgresHelper client = new PostgresHelper(
                DbContract.HOST,
                DbContract.DB_NAME,
                DbContract.USERNAME,
                DbContract.PASSWORD);

        try {
            if (client.connect()) {
                txtInfoBox.setText("DB connected" + "\n\n");

                ResultSet rs = client.execQuery("SELECT * FROM people");
                ResultSetMetaData rsmd = rs.getMetaData();

                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                {
                    txtInfoBox.appendText(rsmd.getColumnName(i) + "\t");
                }

                txtInfoBox.appendText("\n");

                while(rs.next()) {
                    txtInfoBox.appendText(rs.getString(1) + "\t" +
                                          rs.getString(2) + "\t\t\t" +
                                          rs.getString(3));
                    txtInfoBox.appendText("\n");
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
