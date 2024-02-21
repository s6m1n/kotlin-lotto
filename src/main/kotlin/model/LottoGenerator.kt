package model

class LottoGenerator {
    fun make(): Lotto {
        val randomNumbers = (MINIMUM_LOTTO_NUMBER..MAXIMUM_LOTTO_NUMBER).shuffled().take(LOTTO_SIZE).sorted()
        val lottoNumbers = randomNumbers.map { LottoNumber(it) }
        return Lotto(lottoNumbers)
    }

    companion object {
        private const val MINIMUM_LOTTO_NUMBER = 1
        private const val MAXIMUM_LOTTO_NUMBER = 45
        private const val LOTTO_SIZE = 6
    }
}
