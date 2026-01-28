package sec4;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.configuration.Orthography;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.DBUnitExtension;
import com.github.database.rider.junit5.api.DBRider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@DBRider
@DBUnit(
        url = "jdbc:postgresql://localhost:5433/postgres",
        user = "postgres",
        password = "postgres",
        schema = "public",
        caseInsensitiveStrategy = Orthography.LOWERCASE
)

@ExtendWith(DBUnitExtension.class)
class UserDaoTest{

    @Test
    @DataSet("database/users.yml")
}