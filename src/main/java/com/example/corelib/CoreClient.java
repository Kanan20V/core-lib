package com.example.corelib;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
    name = "core-client",
    url = "${api.core.url}",
    contextId = "core-client-context"
)
public interface CoreClient extends CoreFacade {
}