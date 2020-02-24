package codes.biscuit.skyblockaddons.utils;

import codes.biscuit.skyblockaddons.SkyblockAddons;
import codes.biscuit.skyblockaddons.utils.nifty.ChatFormatting;
import com.google.gson.JsonObject;
import lombok.Getter;
import net.minecraftforge.fml.common.Loader;
import org.apache.commons.lang3.text.WordUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

@Getter
@SuppressWarnings("DeprecatedIsStillUsed")
public enum Message {
    LANGUAGE(MessageObject.ROOT, "language"),

    SETTING_MAGMA_BOSS_WARNING(MessageObject.SETTING, "magmaBossWarning"),
    SETTING_ITEM_DROP_CONFIRMATION(MessageObject.SETTING, "itemDropConfirmation"),
    SETTING_WARNING_DURATION(MessageObject.SETTING, "warningDuration"),
    SETTING_HIDE_SKELETON_HAT_BONES(MessageObject.SETTING, "hideSkeletonHatBones"),
    SETTING_SKELETON_HAT_BONES_BAR(MessageObject.SETTING, "skeletonHatBonesBar"),
    SETTING_HIDE_FOOD_AND_ARMOR(MessageObject.SETTING, "hideFoodAndArmor"),
    SETTING_FULL_INVENTORY_WARNING(MessageObject.SETTING, "fullInventoryWarning"),
    SETTING_MAGMA_BOSS_TIMER(MessageObject.SETTING, "magmaBossTimer"),
    SETTING_DISABLE_EMBER_ROD_ABILITY(MessageObject.SETTING, "disableEmberRodAbility"),
    SETTING_EDIT_LOCATIONS(MessageObject.SETTING, "editLocations"),
    SETTING_GUI_SCALE(MessageObject.SETTING, "guiScale"),
    SETTING_RESET_LOCATIONS(MessageObject.SETTING, "resetLocations"),
    SETTING_SETTINGS(MessageObject.SETTING, "settings"),
    SETTING_ENCHANTS_AND_REFORGES(MessageObject.SETTING, "showEnchantmentsReforges"),
    SETTING_MINION_STOP_WARNING(MessageObject.SETTING, "minionStopWarning"),
    SETTING_HIDE_PLAYERS_NEAR_NPCS(MessageObject.SETTING, "hidePlayersNearNPCs"),
    SETTING_BACKPACK_STYLE(MessageObject.SETTING, "backpackStyle"),
    SETTING_SHOW_BACKPACK_PREVIEW(MessageObject.SETTING, "showBackpackPreview"),
    SETTING_HIDE_HEALTH_BAR(MessageObject.SETTING, "hideHealthBar"),
    SETTING_FULL_MINION(MessageObject.SETTING, "fullMinionWarning"),
    SETTING_IGNORE_ITEM_FRAME_CLICKS(MessageObject.SETTING, "ignoreItemFrameClicks"),
    SETTING_USE_VANILLA_TEXTURE(MessageObject.SETTING, "useVanillaTexture"),
    SETTING_SHOW_ONLY_WHEN_HOLDING_SHIFT(MessageObject.SETTING, "showOnlyWhenHoldingShift"),
    SETTING_MANA_BAR(MessageObject.SETTING, "manaBar"),
    SETTING_HEALTH_BAR(MessageObject.SETTING, "healthBar"),
    SETTING_DEFENCE_ICON(MessageObject.SETTING, "defenceIcon"),
    SETTING_MANA_TEXT(MessageObject.SETTING, "manaText"),
    SETTING_HEALTH_TEXT(MessageObject.SETTING, "healthText"),
    SETTING_DEFENCE_TEXT(MessageObject.SETTING, "defenceText"),
    SETTING_DEFENCE_PERCENTAGE(MessageObject.SETTING, "defencePercentage"),
    SETTING_HEALTH_UPDATES(MessageObject.SETTING, "healthUpdates"),
    @Deprecated SETTING_ANCHOR_POINT(MessageObject.SETTING, "anchorPoint"),
    SETTING_HIDE_PLAYERS_IN_LOBBY(MessageObject.SETTING, "hidePlayersInLobby"),
    SETTING_TEXT_STYLE(MessageObject.SETTING, "textStyle"),
    SETTING_DARK_AUCTION_TIMER(MessageObject.SETTING, "darkAuctionTimer"),
    SETTING_ITEM_PICKUP_LOG(MessageObject.SETTING, "itemPickupLog"),
    SETTING_AVOID_PLACING_ENCHANTED_ITEMS(MessageObject.SETTING, "avoidPlacingEnchantedItems"),
    SETTING_AVOID_BREAKING_STEMS(MessageObject.SETTING, "avoidBreakingStems"),
    SETTING_STOP_BOW_CHARGE_FROM_RESETTING(MessageObject.SETTING, "stopBowChargeFromResetting"),
    SETTING_SHOW_ITEM_ANVIL_USES(MessageObject.SETTING, "showItemAnvilUses"),
    SETTING_PREVENT_MOVEMENT_ON_DEATH(MessageObject.SETTING, "preventMovementOnDeath"),
    SETTING_LOCK_SLOTS(MessageObject.SETTING, "lockSlots"),
    SETTING_LOCK_SLOT(MessageObject.SETTING, "lockSlot"),
    SETTING_DONT_RESET_CURSOR_INVENTORY(MessageObject.SETTING, "dontResetCursorInventory"),
    SETTING_SUMMONING_EYE_ALERT(MessageObject.SETTING, "summoningEyeAlert"),
    SETTING_CHANGE_COLOR(MessageObject.SETTING, "changeColor"),
    SETTING_SHOW_IN_OTHER_GAMES(MessageObject.SETTING, "showInOtherGames"),
    SETTING_DONT_OPEN_PROFILES_WITH_BOW(MessageObject.SETTING, "dontOpenProfileWithBow"),
    SETTING_MAKE_ENDERCHESTS_IN_END_GREEN(MessageObject.SETTING, "makeEnderchestsInEndGreen"),
    SETTING_STOP_DROPPING_SELLING_RARE_ITEMS(MessageObject.SETTING, "stopDroppingSellingRareItems"),
    SETTING_MAKE_BACKPACK_INVENTORIES_COLORED(MessageObject.SETTING, "makeBackpackInventoriesColored"),
    @Deprecated SETTING_AVOID_BREAKING_BOTTOM_SUGAR_CANE(MessageObject.SETTING, "avoidBreakingBottomSugarCane"), // disallowed
    SETTING_REPLACE_ROMAN_NUMERALS_WITH_NUMBERS(MessageObject.SETTING, "replaceRomanNumeralsWithNumbers"),
    SETTING_CHANGE_BAR_COLOR_WITH_POTIONS(MessageObject.SETTING, "changeBarColorForPotions"),
    SETTING_CRAFTING_PATTERNS(MessageObject.SETTING, "craftingPatterns"),
    SETTING_FISHING_SOUND_INDICATOR(MessageObject.SETTING, "soundIndicatorForFishing"),
    SETTING_AVOID_BLINKING_NIGHT_VISION(MessageObject.SETTING, "avoidBlinkingNightVision"),
    SETTING_DISABLE_MINION_LOCATION_WARNING(MessageObject.SETTING, "disableMinionLocationWarning"),
    SETTING_JUNGLE_AXE_COOLDOWN(MessageObject.SETTING, "jungleAxeCooldown"),
    SETTING_ORGANIZE_ENCHANTMENTS(MessageObject.SETTING, "organizeLongEnchantmentLists"),
    SETTING_SHOW_ITEM_COOLDOWNS(MessageObject.SETTING, "showItemCooldowns"),
    SETTING_COLLECTION_DISPLAY(MessageObject.SETTING, "collectionDisplay"),
    SETTING_SPEED_PERCENTAGE(MessageObject.SETTING, "speedPercentage"),
    SETTING_ONLY_MINE_ORES_DEEP_CAVERNS(MessageObject.SETTING, "onlyMineOresDeepCaverns"),
    SETTING_ENABLE_MESSAGE_WHEN_ACTION_PREVENTED(MessageObject.SETTING, "enableMessageWhenActionPrevented"),
    SETTING_SLAYER_INDICATOR(MessageObject.SETTING, "revenantIndicator"),
    SETTING_SPECIAL_ZEALOT_ALERT(MessageObject.SETTING, "specialZealotAlert"),
    SETTING_ONLY_MINE_VALUABLES_NETHER(MessageObject.SETTING, "onlyMineValuablesNether"),
    SETTING_DISABLE_MAGICAL_SOUP_MESSAGE(MessageObject.SETTING, "disableMagicalSoupMessage"),
    SETTING_HIDE_PET_HEALTH_BAR(MessageObject.SETTING, "hidePetHealthBar"),
    SETTING_POWER_ORB_DISPLAY(MessageObject.SETTING, "powerOrbDisplay"),
    SETTING_POWER_ORB_DISPLAY_STYLE(MessageObject.SETTING, "powerOrbDisplayStyle"),
    SETTING_ZEALOT_COUNTER(MessageObject.SETTING, "zealotCounter"),
    SETTING_TICKER_CHARGES_DISPLAY(MessageObject.SETTING, "tickerChargesDisplay"),
    SETTING_TAB_EFFECT_TIMERS(MessageObject.SETTING, "tabEffectTimers"),
    SETTING_HIDE_NIGHT_VISION_EFFECT_TIMER(MessageObject.SETTING, "hideNightVisionEffectTimer"),
    SETTING_NO_ARROWS_LEFT_ALERT(MessageObject.SETTING, "noArrowsLeftAlert"),
    SETTING_SHOW_CAKE_BAG_PREVIEW(MessageObject.SETTING, "showCakeBagPreview"),
    SETTING_SHOW_BACKPACK_PREVIEW_AH(MessageObject.SETTING, "showBackpackPreviewInAH"),
    SETTING_ENABLE_DEV_FEATURES(MessageObject.SETTING, "enableDevFeatures"),

    BACKPACK_STYLE_REGULAR(MessageObject.BACKPACK_STYLE, "regular"),
    BACKPACK_STYLE_COMPACT(MessageObject.BACKPACK_STYLE, "compact"),

    MESSAGE_DROP_CONFIRMATION(MessageObject.MESSAGES, "dropConfirmation"),
    MESSAGE_MAGMA_BOSS_WARNING(MessageObject.MESSAGES, "magmaBossWarning"),
    MESSAGE_FULL_INVENTORY(MessageObject.MESSAGES, "fullInventory"),
    MESSAGE_LABYMOD(MessageObject.MESSAGES, "labymod"),
    MESSAGE_MINION_CANNOT_REACH(MessageObject.MESSAGES, "minionCannotReach"),
    MESSAGE_MINION_IS_FULL(MessageObject.MESSAGES, "minionIsFull"),
    MESSAGE_TYPE_ENCHANTMENTS(MessageObject.MESSAGES, "typeEnchantmentsHere"),
    MESSAGE_SEPARATE_ENCHANTMENTS(MessageObject.MESSAGES, "separateMultiple"),
    MESSAGE_ENCHANTS_TO_MATCH(MessageObject.MESSAGES, "enchantsToMatch"),
    MESSAGE_ENCHANTS_TO_EXCLUDE(MessageObject.MESSAGES, "enchantsToExclude"),
    MESSAGE_CANCELLED_STEM_BREAK(MessageObject.MESSAGES, "cancelledStemBreak"),
    MESSAGE_SLOT_LOCKED(MessageObject.MESSAGES, "slotLocked"),
    MESSAGE_SUMMONING_EYE_FOUND(MessageObject.MESSAGES, "summoningEyeFound"),
    MESSAGE_STOPPED_OPENING_PROFILE(MessageObject.MESSAGES, "cancelledProfileOpening"),
    MESSAGE_CANCELLED_DROPPING(MessageObject.MESSAGES, "cancelledDropping"),
    MESSAGE_CLICK_MORE_TIMES(MessageObject.MESSAGES, "clickMoreTimes"),
    MESSAGE_CLICK_ONE_MORE_TIME(MessageObject.MESSAGES, "clickOneMoreTime"),
    MESSAGE_CANCELLED_CANE_BREAK(MessageObject.MESSAGES, "cancelledCaneBreak"),
    MESSAGE_OPEN_MODS_FOLDER(MessageObject.MESSAGES, "openModFolder"),
    MESSAGE_JOIN_DISCORD(MessageObject.MESSAGES, "joinTheDiscord"),
    MESSAGE_FEATURE_DISABLED(MessageObject.MESSAGES, "featureDisabled"),
    MESSAGE_ANVIL_USES(MessageObject.MESSAGES, "anvilUses"),
    MESSAGE_CANCELLED_NON_ORES_BREAK(MessageObject.MESSAGES, "cancelledDeepCaverns"),
    MESSAGE_SPECIAL_ZEALOT_FOUND(MessageObject.MESSAGES, "specialZealotFound"),
    MESSAGE_BLOCK_INCOMPLETE_PATTERNS(MessageObject.MESSAGES, "blockIncompletePatterns"),
    MESSAGE_SEARCH_FEATURES(MessageObject.MESSAGES, "searchFeatures"),
    MESSAGE_ONLY_FEW_ARROWS_LEFT(MessageObject.MESSAGES, "onlyFewArrowsLeft"),
    MESSAGE_NO_ARROWS_LEFT(MessageObject.MESSAGES, "noArrowsLeft"),
    MESSAGE_CHOOSE_A_COLOR(MessageObject.MESSAGES, "chooseAColor"),
    MESSAGE_SELECTED_COLOR(MessageObject.MESSAGES, "selectedColor"),
    MESSAGE_SET_HEX_COLOR(MessageObject.MESSAGES, "setHexColor"),
    MESSAGE_BETA_NOTICE(MessageObject.MESSAGES, "betaNotice"),

    @Deprecated ANCHOR_POINT_TOP_LEFT(MessageObject.ANCHOR_POINT, "topLeft"),
    @Deprecated ANCHOR_POINT_TOP_RIGHT(MessageObject.ANCHOR_POINT, "topRight"),
    @Deprecated ANCHOR_POINT_BOTTOM_LEFT(MessageObject.ANCHOR_POINT, "bottomLeft"),
    @Deprecated ANCHOR_POINT_BOTTOM_RIGHT(MessageObject.ANCHOR_POINT, "bottomRight"),
    @Deprecated ANCHOR_POINT_HEALTH_BAR(MessageObject.ANCHOR_POINT, "healthBar"),

    // Updater messages
    MESSAGE_NEW_UPDATE(MessageObject.UPDATE_MESSAGES, "newUpdateAvailable"),
    MESSAGE_VIEW_PATCH_NOTES(MessageObject.UPDATE_MESSAGES, "wantToViewPatchNotes"),
    MESSAGE_DOWNLOAD_LINK(MessageObject.UPDATE_MESSAGES, "downloadLink"),
    MESSAGE_DOWNLOAD_AUTOMATICALLY(MessageObject.UPDATE_MESSAGES, "downloadAutomatically"),
    UPDATE_MESSAGE_BETA(MessageObject.UPDATE_MESSAGES, "betaAvailable"),
    UPDATE_MESSAGE_MAJOR(MessageObject.UPDATE_MESSAGES, "majorAvailable"),
    UPDATE_MESSAGE_PATCH(MessageObject.UPDATE_MESSAGES, "patchAvailable"),
    UPDATE_MESSAGE_DOWNLOAD(MessageObject.UPDATE_MESSAGES, "downloading"),
    UPDATE_MESSAGE_FAILED(MessageObject.UPDATE_MESSAGES, "failed"),
    UPDATE_MESSAGE_DOWNLOAD_FINISHED(MessageObject.UPDATE_MESSAGES, "downloadFinished"),

    TEXT_STYLE_ONE(MessageObject.TEXT_STYLE, "one"),
    TEXT_STYLE_TWO(MessageObject.TEXT_STYLE, "two"),

    @Deprecated TAB_FEATURES(MessageObject.TAB, "features"), // Tabs are no longer in use.
    @Deprecated TAB_FIXES(MessageObject.TAB, "fixes"),
    @Deprecated TAB_GUI_FEATURES(MessageObject.TAB, "guiFeatures"),
    TAB_GENERAL_SETTINGS(MessageObject.TAB, "generalSettings"),

    INVENTORY_TYPE_ENCHANTS(MessageObject.INVENTORY_TYPE, "enchants"),
    INVENTORY_TYPE_REFORGES(MessageObject.INVENTORY_TYPE, "reforges"),
    INVENTORY_TYPE_CRAFTING(MessageObject.INVENTORY_TYPE, "crafting"),

    POWER_ORB_DISPLAY_STYLE_DETAILED(MessageObject.POWER_ORB_STYLE, "detailed"),
    POWER_ORB_DISPLAY_STYLE_COMPACT(MessageObject.POWER_ORB_STYLE, "compact");

    private MessageObject messageObject;
    private String memberName;

    Message(MessageObject messageObject, String memberName) {
        this.messageObject = messageObject;
        this.memberName = memberName;
    }

    public String getMessage(String... variables) {
        String text;
        try {
            SkyblockAddons main = SkyblockAddons.getInstance();
            List<String> path = getMessageObject().getPath();
            JsonObject jsonObject = main.getConfigValues().getLanguageConfig();
            for (String part : path) {
                if (!part.equals("")) {
                    jsonObject = jsonObject.getAsJsonObject(part);
                }
            }
            text = jsonObject.get(getMemberName()).getAsString();
            if (text != null) {
                if (this == Message.SETTING_BACKPACK_STYLE) {
                    text = text.replace("%style%", main.getConfigValues().getBackpackStyle().getMessage());
                } else if(this == Message.SETTING_POWER_ORB_DISPLAY_STYLE) {
                    text = text.replace("%style%", main.getConfigValues().getPowerOrbDisplayStyle().getMessage());
                } else if (this == Message.SETTING_GUI_SCALE) {
                    text = text.replace("%scale%", variables[0]);
                } else if (this == Message.MESSAGE_NEW_UPDATE || this == UPDATE_MESSAGE_MAJOR || this == UPDATE_MESSAGE_PATCH) {
                    text = text.replace("%version%", variables[0]);
                //} else if (this == Message.SETTING_BACKPACK_STYLE) {
                //    text = text.replace("%style%", main.getConfigValues().getBackpackStyle().getMessage());
                } else if (this == Message.SETTING_TEXT_STYLE) {
                    text = text.replace("%style%", main.getConfigValues().getTextStyle().getMessage());
                } else if (this == Message.MESSAGE_MINION_CANNOT_REACH || this == Message.MESSAGE_TYPE_ENCHANTMENTS
                        || this == Message.MESSAGE_ENCHANTS_TO_MATCH || this == Message.MESSAGE_ENCHANTS_TO_EXCLUDE) {
                    text = text.replace("%type%", variables[0]);
                } else if (this == Message.MESSAGE_CLICK_MORE_TIMES) {
                    text = text.replace("%times%", variables[0]);
                } else if (this == Message.UPDATE_MESSAGE_DOWNLOAD) {
                    text = text.replace("%downloaded%", variables[0]).replace("%total%", variables[1]);
                } else if (this == Message.UPDATE_MESSAGE_DOWNLOAD_FINISHED) {
                    text = text.replace("%file%", variables[0]);
                } else if (this == Message.MESSAGE_ANVIL_USES) {
                    text = text.replace("%uses%", main.getConfigValues().getRestrictedColor(Feature.SHOW_ITEM_ANVIL_USES)+variables[0]+ChatFormatting.GRAY.toString());
                } else if (this == Message.MESSAGE_ONLY_FEW_ARROWS_LEFT) {
                    text = text.replace("%arrows%", variables[0]);
                } else if (this == Message.MESSAGE_BETA_NOTICE || this == Message.UPDATE_MESSAGE_BETA) {
                    text = text.replace("%version%", Loader.instance().activeModContainer().getVersion());
                }
            }
            if (text != null && (main.getConfigValues().getLanguage() == Language.HEBREW || main.getConfigValues().getLanguage() == Language.ARABIC)) {
                text = main.getUtils().reverseText(text);
            }
        } catch (NullPointerException ex) { // In case I messed up like the arguments of something, woops.
            ex.printStackTrace();
            text = memberName;
        }
        return text;
    }

    /**
     * Gets the message with word wrapping for the chat window
     *
     * @param variables replacement string(s) for the message's placeholders
     * @return the message as
     */
    public String[] getMessageForChat(String... variables) {
        String messageString = getMessage(variables);

        // Wrap around the text, replace the carriage returns, and split at the new lines.
        return WordUtils.wrap(messageString, 36).replace("\r", "").split(Pattern.quote("\n"));
    }

    @Getter
    enum MessageObject {
        ROOT(""),
        SETTING("settings"),
        MESSAGES("messages"),
        BACKPACK_STYLE("settings.backpackStyles"),
        POWER_ORB_STYLE("settings.powerOrbStyle"),
        INVENTORY_TYPE("messages.inventoryTypes"),
        TEXT_STYLE("settings.textStyles"),
        TAB("settings.tab"),
        UPDATE_MESSAGES("messages.update"),
        ANCHOR_POINT("settings.anchorPoints");

        private List<String> path;

        MessageObject(String path) {
            this.path = new LinkedList<>(Arrays.asList(path.split(Pattern.quote("."))));
        }
    }

}
