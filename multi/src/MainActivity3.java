//void setBackgroundResource(int resid)
//Drawable getBackground()
//void start()
//
//media_FrameAnimation

ImageView iv_pic = (ImageView) findViewById(R.id.iv_pic);

iv_pic.setBackgroundResource(R.drawable.pic_animation);

AnimationDrawable anim = (AnimationDrawable) iv_pic.getBackground();

anim.start();

