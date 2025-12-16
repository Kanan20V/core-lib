package com.example.corelib.client.account;

import com.example.corelib.client.account.model.AccountRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountClient {

  @PostMapping("/accounts")
  void createAccount(@RequestBody AccountRequestDto request);
}
