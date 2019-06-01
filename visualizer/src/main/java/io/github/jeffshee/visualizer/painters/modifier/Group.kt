package io.github.jeffshee.visualizer.painters.modifier

import android.graphics.Canvas
import io.github.jeffshee.visualizer.painters.Painter
import io.github.jeffshee.visualizer.utils.VisualizerHelper

class Group(var painters: List<Painter>) : Painter() {

    override fun draw(canvas: Canvas, helper: VisualizerHelper) {
        painters.forEach { painter -> painter.draw(canvas, helper) }
    }
}