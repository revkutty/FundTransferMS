package com.tekarch.FundTransferMS.Service;

import com.tekarch.FundTransferMS.DTO.AccountDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*@Service
public class AccountService {


    private final RestTemplate restTemplate;

    public AccountService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }



    public AccountDTO getAccountById(Long accountId){
        String url = "http://localhost:8082/api/account/" + accountId;
        return restTemplate.getForObject(url, AccountDTO.class);
    }


    public void updateAccount(AccountDTO accountDTO) {
        String url = "http://localhost:8082/api/account/" ;
        restTemplate.put(url, accountDTO);
    }


}
*/