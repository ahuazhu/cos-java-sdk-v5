package com.qcloud.cos.model.ciModel.job;

import java.io.Serializable;

/**
 * 媒体处理 Audio实体 https://cloud.tencent.com/document/product/460/48234
 */

public class MediaAudioMixObject implements Serializable {

    /**
     * 混音文件地址
     * 需与 Input 媒体文件存储于同一 bucket
     */
    private String audioSource;
    /**
     * 混音模式
     * 1. Repeat：背景音循环 默认值
     * 2. Once：背景音一次播放
     */
    private String mixMode;
    /**
     * 是否用混音音轨媒体替换 Input 媒体文件的原音频
     * true/false
     */
    private String replace;

    /**
     * 混音淡入淡出配置
     * true/false
     * 默认为false
     */
    private String effectConfig;

    private String directMix;

    public String getAudioSource() {
        return audioSource;
    }

    public void setAudioSource(String audioSource) {
        this.audioSource = audioSource;
    }

    public String getMixMode() {
        return mixMode;
    }

    public void setMixMode(String mixMode) {
        this.mixMode = mixMode;
    }

    public String getReplace() {
        return replace;
    }

    public void setReplace(String replace) {
        this.replace = replace;
    }

    public String getEffectConfig() {
        return effectConfig;
    }

    public void setEffectConfig(String effectConfig) {
        this.effectConfig = effectConfig;
    }

    public String getDirectMix() {
        return directMix;
    }

    public void setDirectMix(String directMix) {
        this.directMix = directMix;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MediaAudioMixObject{");
        sb.append("audioSource='").append(audioSource).append('\'');
        sb.append(", mixMode='").append(mixMode).append('\'');
        sb.append(", replace='").append(replace).append('\'');
        sb.append(", effectConfig='").append(effectConfig).append('\'');
        sb.append(", directMix='").append(directMix).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
