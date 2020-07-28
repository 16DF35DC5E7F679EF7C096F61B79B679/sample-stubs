package contracts.countryContext

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Create a country"

    request {
        url "/country"
        method POST()
        body
    }

    response {
        status CREATED()
        headers {
            contentType applicationJson()
        }
        body (
                '''
                {
                    "status": "SUCCESS",
                    "errors": {},
                    "data": "abcd"
                }
                '''
        )
    }
}
