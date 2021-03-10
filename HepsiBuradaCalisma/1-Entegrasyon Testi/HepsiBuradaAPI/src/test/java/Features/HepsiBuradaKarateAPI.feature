Feature: HepsiBurada API TEST

  Background:
    * url 'http://generator.swagger.io/'

  Scenario: get call test

    Given path 'api/swagger.json'
    When method get

    * def guestResponse = 200;

    # Url'e istek atılır, Başarılı yada Başarısız olma durumuna göre sonuç basılır. Rapor üretilir.
    # target-> surefire-reports -> html dosyasına sağ tık -> open in browser ile rapor görüntülenir.

    * def allRequest = responseStatus == guestResponse ? 'passResult.feature' : 'failedResult.feature'
    * def result = call read(allRequest)