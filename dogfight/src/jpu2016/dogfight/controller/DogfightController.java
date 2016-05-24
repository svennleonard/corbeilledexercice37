package jpu2016.dogfight.controller;

import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IViewSystem, IDogfightModel, IOrderPerformer {
	private final int TIME_SLEEP = 30;

	public DogfightController(final IDogfightModel dogfightModel) {

	}

	private void gameLoop() {

	}

	public int getTIME_SLEEP() {
		return this.TIME_SLEEP;
	}

	private void launchMissile(final int player) {

	}

	@Override
	public void orderPerform(final UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(final IViewSystem viewSystem) {

	}
}
