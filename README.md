# kotlin-lotto

## 기능 목록
---

### 유효성 검사
- [ ] 구입금액에 대한 유효성을 검사한다.
  - [ ] 구입금액이 1000원 미만이면 예외 반환
   - [ ] "구입금액은 1000원 이상이어야 합니다."
  - [ ] 구입금액이 1000원 단위가 아니면 예외 반환
    - [ ] "구입금액은 1000원 단위여야 합니다." 
  - [ ] 정수형이 아니면 예외 반환
    - [ ] "구입금액은 정수여야 합니다."

- [ ] 당첨번호에 대한 유효성을 검사한다.
  - [x] 당첨번호가 1 ~ 45를 벗어나면 예외 반환
    - [x] "당첨번호는 1 ~ 45 사이의 정수여야 합니다."
  - [ ] 당첨번호가 중복되면 예외 반환
    - [ ] "당첨번호끼리는 중복되면 안됩니다."
  - [ ] 당첨번호가 6개가 아니면 예외 반환
    - [ ] "당첨번호는 6개여야 합니다."

- [ ] 보너스번호에 대한 유효성을 검사한다.
  - [x] 보너스번호가 1 ~ 45를 벗어나면 예외 반환
    - [x] "보너스번호는 1 ~ 45 사이의 정수여야 합니다."
  - [ ] 보너스번호가 당첨번호와 중복되면 예외 반환
    - [ ] "보너스번호는 당첨번호와 중복되면 안됩니다."

### 출력

- [ ] 로또 티켓들을 출력한다.
- [ ] 안내메시지를 출력한다.
- [ ] 당첨 통계를 출력한다.
- [ ] 수익률을 출력한다.

### 기능
- [ ] 로또 번호 생성기
  - [ ] 1 ~ 45 사이의 정수 중 랜덤하게 6개를 뽑는다
- [ ] 로또 번호 일치 갯수 계산기
  - [ ] 당첨 번호를 로또 티켓과 비교한다
  - [ ] 5개 일치할 때 보너스 볼을 로또 티켓과 비교한다
  - [ ] 일치 갯수와 보너스 볼 매치 여부를 반환한다
- [ ] 당첨 통계 계산기
  - [ ] 당첨 통계를 반환한다
  - [ ] 수익률 계산하기
