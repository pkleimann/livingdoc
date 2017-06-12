package org.livingdoc.fixture.converter.number


internal class LongConverterTest : NumberConverterContract<Long>() {

    override val cut = LongConverter()

    override val minValue = Long.MIN_VALUE
    override val negativeValue = -42L
    override val zeroValue = 0L
    override val positiveValue = 42L
    override val maxValue = Long.MAX_VALUE

    override val englishValue = "42,000.12" to 42000L
    override val germanValue = "42.000,12" to 42000L

}