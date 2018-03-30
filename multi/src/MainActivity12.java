//static Animation loadAnimation(Context context, int d)
//void startAnimation(Animation animation)
//

Animation animation = AnimationUtils.loadAnimation(v.getContext(), R.anim.sample);

animation.setFillAfter(true);

v.startAnimation(animation);


