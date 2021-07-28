package taxi.service.impl;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;
import taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.info("Login method was called. Login: {}", login);
        Optional<Driver> driverByLogin = driverService.getDriverByLogin(login);
        if (driverByLogin.isEmpty() || !password.equals(driverByLogin.get().getPassword())) {
            throw new AuthenticationException("Login or password is incorrect, please "
                    + "check your data, or click on REGISTER button");
        }
        return driverByLogin.get();
    }
}

