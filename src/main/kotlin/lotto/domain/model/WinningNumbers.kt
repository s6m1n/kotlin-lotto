package lotto.domain.model

data class WinningNumbers(val lotto: Lotto, val bonus: LottoNumber) {
    init {
        require(lotto.numbers.contains(bonus).not()) { DUPLICATED_BONUS_NUMBER_EXCEPTION_MESSAGE }
    }

    fun getRank(targetLotto: Lotto): Rank {
        val countOfMatch = targetLotto.getMatchCount(lotto)
        val matchBonus = targetLotto.isContain(bonus)
        return Rank.valueOf(countOfMatch, matchBonus)
    }

    fun getResult(lottoTickets: List<Lotto>): LottoDrawingResult {
        val ranks = lottoTickets.map { getRank(it) }
        return LottoDrawingResult(ranks.groupingBy { rank -> rank }.eachCount())
    }

    companion object {
        private const val DUPLICATED_BONUS_NUMBER_EXCEPTION_MESSAGE = "보너스 번호는 당첨번호와 중복되면 안됩니다."
    }
}
