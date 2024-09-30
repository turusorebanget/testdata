
package io.getarrays.server.Service.implementation;

import io.getarrays.server.Service.ServerService;
import io.getarrays.server.model.ServerModel;
import io.getarrays.server.repo.ServerRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService {
//    private final ServerRepo serverRepo;

    //menit ke 26
    //https://www.youtube.com/watch?v=8ZPsZBcue50&t=10372s
    @Override
    public ServerModel create(ServerModel server) {
        log.info("saving new server : {}",server.getClass().getName());
        server.setImageUrl(setServerImageUrl());
        return serverRepo.save(server);
    }

    @Override
    public ServerModel ping(String ipAddress) {
        log.info("Pinging server IP : {}",ipAddress);
        Server server = serverRepo.findByIpAddress(ipAddress);
        InetAddress address = InetAddress.getByName(ipAddress);
        return null;
    }

    @Override
    public Collection<ServerModel> list(int limit) {
        return null;
    }

    @Override
    public ServerModel get(Long id) {
        return null;
    }

    @Override
    public ServerModel update(ServerModel server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Server update(Server server){
        return null;
    }
}

