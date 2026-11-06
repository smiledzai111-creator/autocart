package com.example.cartbomb;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.glfw.GLFW;

public class CartBombClient implements ClientModInitializer {
    public static KeyMapping triggerKey;

    @Override
    public void onInitializeClient() {
        // Đăng ký phím tắt (Ví dụ: phím R)
        triggerKey = KeyBindingHelper.registerKeyMapping(new KeyMapping(
            "key.cartbomb.trigger",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_R,
            "category.cartbomb.main"
        ));
    }
}
