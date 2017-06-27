/**
 * Hidden Switch Minionate API
 * The Minionate API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hiddenswitch.proto3.net.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.hiddenswitch.proto3.net.client.models.GameEventAfterSpellCasted;
import com.hiddenswitch.proto3.net.client.models.GameEventArmorGained;
import com.hiddenswitch.proto3.net.client.models.GameEventBeforeSummon;
import com.hiddenswitch.proto3.net.client.models.GameEventCardPlayed;
import com.hiddenswitch.proto3.net.client.models.GameEventCardRevealed;
import com.hiddenswitch.proto3.net.client.models.GameEventDamage;
import com.hiddenswitch.proto3.net.client.models.GameEventDrawCard;
import com.hiddenswitch.proto3.net.client.models.GameEventHeal;
import com.hiddenswitch.proto3.net.client.models.GameEventHeroPowerUsed;
import com.hiddenswitch.proto3.net.client.models.GameEventJoust;
import com.hiddenswitch.proto3.net.client.models.GameEventKill;
import com.hiddenswitch.proto3.net.client.models.GameEventPerformedGameAction;
import com.hiddenswitch.proto3.net.client.models.GameEventPreDamage;
import com.hiddenswitch.proto3.net.client.models.GameEventSecretPlayed;
import com.hiddenswitch.proto3.net.client.models.GameEventSecretRevealed;
import com.hiddenswitch.proto3.net.client.models.GameEventSilence;
import com.hiddenswitch.proto3.net.client.models.GameEventSpellCasted;
import com.hiddenswitch.proto3.net.client.models.GameEventTargetAcquisition;
import com.hiddenswitch.proto3.net.client.models.GameEventTriggerFired;
import com.hiddenswitch.proto3.net.client.models.GameEventWeaponDestroyed;
import com.hiddenswitch.proto3.net.client.models.PhysicalAttackEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GameEvent
 */

public class GameEvent  implements Serializable {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isPowerHistory")
  private Boolean isPowerHistory = null;

  /**
   * The game event type corresponding to this game event. 
   */
  public enum EventTypeEnum {
    @SerializedName("AFTER_PHYSICAL_ATTACK")
    AFTER_PHYSICAL_ATTACK("AFTER_PHYSICAL_ATTACK"),
    
    @SerializedName("AFTER_SPELL_CASTED")
    AFTER_SPELL_CASTED("AFTER_SPELL_CASTED"),
    
    @SerializedName("AFTER_SUMMON")
    AFTER_SUMMON("AFTER_SUMMON"),
    
    @SerializedName("ARMOR_GAINED")
    ARMOR_GAINED("ARMOR_GAINED"),
    
    @SerializedName("BEFORE_SUMMON")
    BEFORE_SUMMON("BEFORE_SUMMON"),
    
    @SerializedName("BOARD_CHANGED")
    BOARD_CHANGED("BOARD_CHANGED"),
    
    @SerializedName("DAMAGE")
    DAMAGE("DAMAGE"),
    
    @SerializedName("DISCARD")
    DISCARD("DISCARD"),
    
    @SerializedName("DRAW_CARD")
    DRAW_CARD("DRAW_CARD"),
    
    @SerializedName("ENRAGE_CHANGED")
    ENRAGE_CHANGED("ENRAGE_CHANGED"),
    
    @SerializedName("ENTITY_TOUCHED")
    ENTITY_TOUCHED("ENTITY_TOUCHED"),
    
    @SerializedName("ENTITY_UNTOUCHED")
    ENTITY_UNTOUCHED("ENTITY_UNTOUCHED"),
    
    @SerializedName("GAME_START")
    GAME_START("GAME_START"),
    
    @SerializedName("HEAL")
    HEAL("HEAL"),
    
    @SerializedName("HERO_POWER_USED")
    HERO_POWER_USED("HERO_POWER_USED"),
    
    @SerializedName("JOUST")
    JOUST("JOUST"),
    
    @SerializedName("KILL")
    KILL("KILL"),
    
    @SerializedName("OVERLOAD")
    OVERLOAD("OVERLOAD"),
    
    @SerializedName("PERFORMED_GAME_ACTION")
    PERFORMED_GAME_ACTION("PERFORMED_GAME_ACTION"),
    
    @SerializedName("PHYSICAL_ATTACK")
    PHYSICAL_ATTACK("PHYSICAL_ATTACK"),
    
    @SerializedName("PLAY_CARD")
    PLAY_CARD("PLAY_CARD"),
    
    @SerializedName("PRE_DAMAGE")
    PRE_DAMAGE("PRE_DAMAGE"),
    
    @SerializedName("REVEAL_CARD")
    REVEAL_CARD("REVEAL_CARD"),
    
    @SerializedName("SECRET_PLAYED")
    SECRET_PLAYED("SECRET_PLAYED"),
    
    @SerializedName("SECRET_REVEALED")
    SECRET_REVEALED("SECRET_REVEALED"),
    
    @SerializedName("SPELL_CASTED")
    SPELL_CASTED("SPELL_CASTED"),
    
    @SerializedName("SUMMON")
    SUMMON("SUMMON"),
    
    @SerializedName("TARGET_ACQUISITION")
    TARGET_ACQUISITION("TARGET_ACQUISITION"),
    
    @SerializedName("TRIGGER_FIRED")
    TRIGGER_FIRED("TRIGGER_FIRED"),
    
    @SerializedName("TURN_END")
    TURN_END("TURN_END"),
    
    @SerializedName("TURN_START")
    TURN_START("TURN_START"),
    
    @SerializedName("SILENCE")
    SILENCE("SILENCE"),
    
    @SerializedName("WEAPON_DESTROYED")
    WEAPON_DESTROYED("WEAPON_DESTROYED"),
    
    @SerializedName("WEAPON_EQUIPPED")
    WEAPON_EQUIPPED("WEAPON_EQUIPPED");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  @SerializedName("afterPhysicalAttack")
  private PhysicalAttackEvent afterPhysicalAttack = null;

  @SerializedName("drawCard")
  private GameEventDrawCard drawCard = null;

  @SerializedName("entityTouched")
  private Integer entityTouched = null;

  @SerializedName("entityUntouched")
  private Integer entityUntouched = null;

  @SerializedName("preDamage")
  private GameEventPreDamage preDamage = null;

  @SerializedName("silence")
  private GameEventSilence silence = null;

  @SerializedName("secretPlayed")
  private GameEventSecretPlayed secretPlayed = null;

  @SerializedName("beforeSummon")
  private GameEventBeforeSummon beforeSummon = null;

  @SerializedName("cardPlayed")
  private GameEventCardPlayed cardPlayed = null;

  @SerializedName("armorGained")
  private GameEventArmorGained armorGained = null;

  @SerializedName("afterSummon")
  private GameEventBeforeSummon afterSummon = null;

  @SerializedName("spellCasted")
  private GameEventSpellCasted spellCasted = null;

  @SerializedName("joust")
  private GameEventJoust joust = null;

  @SerializedName("weaponDestroyed")
  private GameEventWeaponDestroyed weaponDestroyed = null;

  @SerializedName("heroPowerUsed")
  private GameEventHeroPowerUsed heroPowerUsed = null;

  @SerializedName("cardRevealed")
  private GameEventCardRevealed cardRevealed = null;

  @SerializedName("enrageChanged")
  private GameEventSilence enrageChanged = null;

  @SerializedName("targetAcquisition")
  private GameEventTargetAcquisition targetAcquisition = null;

  @SerializedName("damage")
  private GameEventDamage damage = null;

  @SerializedName("weaponEquipped")
  private GameEventWeaponDestroyed weaponEquipped = null;

  @SerializedName("performedGameAction")
  private GameEventPerformedGameAction performedGameAction = null;

  @SerializedName("physicalAttack")
  private PhysicalAttackEvent physicalAttack = null;

  @SerializedName("overload")
  private GameEventCardPlayed overload = null;

  @SerializedName("heal")
  private GameEventHeal heal = null;

  @SerializedName("secretRevealed")
  private GameEventSecretRevealed secretRevealed = null;

  @SerializedName("summon")
  private GameEventBeforeSummon summon = null;

  @SerializedName("afterSpellCasted")
  private GameEventAfterSpellCasted afterSpellCasted = null;

  @SerializedName("discard")
  private GameEventCardPlayed discard = null;

  @SerializedName("kill")
  private GameEventKill kill = null;

  @SerializedName("triggerFired")
  private GameEventTriggerFired triggerFired = null;

  public GameEvent id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * An integer ID corresponding to the order of this event from the client's point of view. 
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "An integer ID corresponding to the order of this event from the client's point of view. ")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GameEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A plaintext description of this event. 
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A plaintext description of this event. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GameEvent isPowerHistory(Boolean isPowerHistory) {
    this.isPowerHistory = isPowerHistory;
    return this;
  }

   /**
   * Should this event be rendered in the power history? 
   * @return isPowerHistory
  **/
  @ApiModelProperty(example = "null", value = "Should this event be rendered in the power history? ")
  public Boolean getIsPowerHistory() {
    return isPowerHistory;
  }

  public void setIsPowerHistory(Boolean isPowerHistory) {
    this.isPowerHistory = isPowerHistory;
  }

  public GameEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The game event type corresponding to this game event. 
   * @return eventType
  **/
  @ApiModelProperty(example = "null", value = "The game event type corresponding to this game event. ")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public GameEvent afterPhysicalAttack(PhysicalAttackEvent afterPhysicalAttack) {
    this.afterPhysicalAttack = afterPhysicalAttack;
    return this;
  }

   /**
   * Get afterPhysicalAttack
   * @return afterPhysicalAttack
  **/
  @ApiModelProperty(example = "null", value = "")
  public PhysicalAttackEvent getAfterPhysicalAttack() {
    return afterPhysicalAttack;
  }

  public void setAfterPhysicalAttack(PhysicalAttackEvent afterPhysicalAttack) {
    this.afterPhysicalAttack = afterPhysicalAttack;
  }

  public GameEvent drawCard(GameEventDrawCard drawCard) {
    this.drawCard = drawCard;
    return this;
  }

   /**
   * Get drawCard
   * @return drawCard
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventDrawCard getDrawCard() {
    return drawCard;
  }

  public void setDrawCard(GameEventDrawCard drawCard) {
    this.drawCard = drawCard;
  }

  public GameEvent entityTouched(Integer entityTouched) {
    this.entityTouched = entityTouched;
    return this;
  }

   /**
   * Get entityTouched
   * @return entityTouched
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEntityTouched() {
    return entityTouched;
  }

  public void setEntityTouched(Integer entityTouched) {
    this.entityTouched = entityTouched;
  }

  public GameEvent entityUntouched(Integer entityUntouched) {
    this.entityUntouched = entityUntouched;
    return this;
  }

   /**
   * Get entityUntouched
   * @return entityUntouched
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEntityUntouched() {
    return entityUntouched;
  }

  public void setEntityUntouched(Integer entityUntouched) {
    this.entityUntouched = entityUntouched;
  }

  public GameEvent preDamage(GameEventPreDamage preDamage) {
    this.preDamage = preDamage;
    return this;
  }

   /**
   * Get preDamage
   * @return preDamage
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventPreDamage getPreDamage() {
    return preDamage;
  }

  public void setPreDamage(GameEventPreDamage preDamage) {
    this.preDamage = preDamage;
  }

  public GameEvent silence(GameEventSilence silence) {
    this.silence = silence;
    return this;
  }

   /**
   * Get silence
   * @return silence
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventSilence getSilence() {
    return silence;
  }

  public void setSilence(GameEventSilence silence) {
    this.silence = silence;
  }

  public GameEvent secretPlayed(GameEventSecretPlayed secretPlayed) {
    this.secretPlayed = secretPlayed;
    return this;
  }

   /**
   * Get secretPlayed
   * @return secretPlayed
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventSecretPlayed getSecretPlayed() {
    return secretPlayed;
  }

  public void setSecretPlayed(GameEventSecretPlayed secretPlayed) {
    this.secretPlayed = secretPlayed;
  }

  public GameEvent beforeSummon(GameEventBeforeSummon beforeSummon) {
    this.beforeSummon = beforeSummon;
    return this;
  }

   /**
   * Get beforeSummon
   * @return beforeSummon
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventBeforeSummon getBeforeSummon() {
    return beforeSummon;
  }

  public void setBeforeSummon(GameEventBeforeSummon beforeSummon) {
    this.beforeSummon = beforeSummon;
  }

  public GameEvent cardPlayed(GameEventCardPlayed cardPlayed) {
    this.cardPlayed = cardPlayed;
    return this;
  }

   /**
   * Get cardPlayed
   * @return cardPlayed
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventCardPlayed getCardPlayed() {
    return cardPlayed;
  }

  public void setCardPlayed(GameEventCardPlayed cardPlayed) {
    this.cardPlayed = cardPlayed;
  }

  public GameEvent armorGained(GameEventArmorGained armorGained) {
    this.armorGained = armorGained;
    return this;
  }

   /**
   * Get armorGained
   * @return armorGained
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventArmorGained getArmorGained() {
    return armorGained;
  }

  public void setArmorGained(GameEventArmorGained armorGained) {
    this.armorGained = armorGained;
  }

  public GameEvent afterSummon(GameEventBeforeSummon afterSummon) {
    this.afterSummon = afterSummon;
    return this;
  }

   /**
   * Get afterSummon
   * @return afterSummon
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventBeforeSummon getAfterSummon() {
    return afterSummon;
  }

  public void setAfterSummon(GameEventBeforeSummon afterSummon) {
    this.afterSummon = afterSummon;
  }

  public GameEvent spellCasted(GameEventSpellCasted spellCasted) {
    this.spellCasted = spellCasted;
    return this;
  }

   /**
   * Get spellCasted
   * @return spellCasted
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventSpellCasted getSpellCasted() {
    return spellCasted;
  }

  public void setSpellCasted(GameEventSpellCasted spellCasted) {
    this.spellCasted = spellCasted;
  }

  public GameEvent joust(GameEventJoust joust) {
    this.joust = joust;
    return this;
  }

   /**
   * Get joust
   * @return joust
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventJoust getJoust() {
    return joust;
  }

  public void setJoust(GameEventJoust joust) {
    this.joust = joust;
  }

  public GameEvent weaponDestroyed(GameEventWeaponDestroyed weaponDestroyed) {
    this.weaponDestroyed = weaponDestroyed;
    return this;
  }

   /**
   * Get weaponDestroyed
   * @return weaponDestroyed
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventWeaponDestroyed getWeaponDestroyed() {
    return weaponDestroyed;
  }

  public void setWeaponDestroyed(GameEventWeaponDestroyed weaponDestroyed) {
    this.weaponDestroyed = weaponDestroyed;
  }

  public GameEvent heroPowerUsed(GameEventHeroPowerUsed heroPowerUsed) {
    this.heroPowerUsed = heroPowerUsed;
    return this;
  }

   /**
   * Get heroPowerUsed
   * @return heroPowerUsed
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventHeroPowerUsed getHeroPowerUsed() {
    return heroPowerUsed;
  }

  public void setHeroPowerUsed(GameEventHeroPowerUsed heroPowerUsed) {
    this.heroPowerUsed = heroPowerUsed;
  }

  public GameEvent cardRevealed(GameEventCardRevealed cardRevealed) {
    this.cardRevealed = cardRevealed;
    return this;
  }

   /**
   * Get cardRevealed
   * @return cardRevealed
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventCardRevealed getCardRevealed() {
    return cardRevealed;
  }

  public void setCardRevealed(GameEventCardRevealed cardRevealed) {
    this.cardRevealed = cardRevealed;
  }

  public GameEvent enrageChanged(GameEventSilence enrageChanged) {
    this.enrageChanged = enrageChanged;
    return this;
  }

   /**
   * Get enrageChanged
   * @return enrageChanged
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventSilence getEnrageChanged() {
    return enrageChanged;
  }

  public void setEnrageChanged(GameEventSilence enrageChanged) {
    this.enrageChanged = enrageChanged;
  }

  public GameEvent targetAcquisition(GameEventTargetAcquisition targetAcquisition) {
    this.targetAcquisition = targetAcquisition;
    return this;
  }

   /**
   * Get targetAcquisition
   * @return targetAcquisition
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventTargetAcquisition getTargetAcquisition() {
    return targetAcquisition;
  }

  public void setTargetAcquisition(GameEventTargetAcquisition targetAcquisition) {
    this.targetAcquisition = targetAcquisition;
  }

  public GameEvent damage(GameEventDamage damage) {
    this.damage = damage;
    return this;
  }

   /**
   * Get damage
   * @return damage
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventDamage getDamage() {
    return damage;
  }

  public void setDamage(GameEventDamage damage) {
    this.damage = damage;
  }

  public GameEvent weaponEquipped(GameEventWeaponDestroyed weaponEquipped) {
    this.weaponEquipped = weaponEquipped;
    return this;
  }

   /**
   * Get weaponEquipped
   * @return weaponEquipped
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventWeaponDestroyed getWeaponEquipped() {
    return weaponEquipped;
  }

  public void setWeaponEquipped(GameEventWeaponDestroyed weaponEquipped) {
    this.weaponEquipped = weaponEquipped;
  }

  public GameEvent performedGameAction(GameEventPerformedGameAction performedGameAction) {
    this.performedGameAction = performedGameAction;
    return this;
  }

   /**
   * Get performedGameAction
   * @return performedGameAction
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventPerformedGameAction getPerformedGameAction() {
    return performedGameAction;
  }

  public void setPerformedGameAction(GameEventPerformedGameAction performedGameAction) {
    this.performedGameAction = performedGameAction;
  }

  public GameEvent physicalAttack(PhysicalAttackEvent physicalAttack) {
    this.physicalAttack = physicalAttack;
    return this;
  }

   /**
   * Get physicalAttack
   * @return physicalAttack
  **/
  @ApiModelProperty(example = "null", value = "")
  public PhysicalAttackEvent getPhysicalAttack() {
    return physicalAttack;
  }

  public void setPhysicalAttack(PhysicalAttackEvent physicalAttack) {
    this.physicalAttack = physicalAttack;
  }

  public GameEvent overload(GameEventCardPlayed overload) {
    this.overload = overload;
    return this;
  }

   /**
   * Get overload
   * @return overload
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventCardPlayed getOverload() {
    return overload;
  }

  public void setOverload(GameEventCardPlayed overload) {
    this.overload = overload;
  }

  public GameEvent heal(GameEventHeal heal) {
    this.heal = heal;
    return this;
  }

   /**
   * Get heal
   * @return heal
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventHeal getHeal() {
    return heal;
  }

  public void setHeal(GameEventHeal heal) {
    this.heal = heal;
  }

  public GameEvent secretRevealed(GameEventSecretRevealed secretRevealed) {
    this.secretRevealed = secretRevealed;
    return this;
  }

   /**
   * Get secretRevealed
   * @return secretRevealed
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventSecretRevealed getSecretRevealed() {
    return secretRevealed;
  }

  public void setSecretRevealed(GameEventSecretRevealed secretRevealed) {
    this.secretRevealed = secretRevealed;
  }

  public GameEvent summon(GameEventBeforeSummon summon) {
    this.summon = summon;
    return this;
  }

   /**
   * Get summon
   * @return summon
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventBeforeSummon getSummon() {
    return summon;
  }

  public void setSummon(GameEventBeforeSummon summon) {
    this.summon = summon;
  }

  public GameEvent afterSpellCasted(GameEventAfterSpellCasted afterSpellCasted) {
    this.afterSpellCasted = afterSpellCasted;
    return this;
  }

   /**
   * Get afterSpellCasted
   * @return afterSpellCasted
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventAfterSpellCasted getAfterSpellCasted() {
    return afterSpellCasted;
  }

  public void setAfterSpellCasted(GameEventAfterSpellCasted afterSpellCasted) {
    this.afterSpellCasted = afterSpellCasted;
  }

  public GameEvent discard(GameEventCardPlayed discard) {
    this.discard = discard;
    return this;
  }

   /**
   * Get discard
   * @return discard
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventCardPlayed getDiscard() {
    return discard;
  }

  public void setDiscard(GameEventCardPlayed discard) {
    this.discard = discard;
  }

  public GameEvent kill(GameEventKill kill) {
    this.kill = kill;
    return this;
  }

   /**
   * Get kill
   * @return kill
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventKill getKill() {
    return kill;
  }

  public void setKill(GameEventKill kill) {
    this.kill = kill;
  }

  public GameEvent triggerFired(GameEventTriggerFired triggerFired) {
    this.triggerFired = triggerFired;
    return this;
  }

   /**
   * Get triggerFired
   * @return triggerFired
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameEventTriggerFired getTriggerFired() {
    return triggerFired;
  }

  public void setTriggerFired(GameEventTriggerFired triggerFired) {
    this.triggerFired = triggerFired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameEvent gameEvent = (GameEvent) o;
    return Objects.equals(this.id, gameEvent.id) &&
        Objects.equals(this.description, gameEvent.description) &&
        Objects.equals(this.isPowerHistory, gameEvent.isPowerHistory) &&
        Objects.equals(this.eventType, gameEvent.eventType) &&
        Objects.equals(this.afterPhysicalAttack, gameEvent.afterPhysicalAttack) &&
        Objects.equals(this.drawCard, gameEvent.drawCard) &&
        Objects.equals(this.entityTouched, gameEvent.entityTouched) &&
        Objects.equals(this.entityUntouched, gameEvent.entityUntouched) &&
        Objects.equals(this.preDamage, gameEvent.preDamage) &&
        Objects.equals(this.silence, gameEvent.silence) &&
        Objects.equals(this.secretPlayed, gameEvent.secretPlayed) &&
        Objects.equals(this.beforeSummon, gameEvent.beforeSummon) &&
        Objects.equals(this.cardPlayed, gameEvent.cardPlayed) &&
        Objects.equals(this.armorGained, gameEvent.armorGained) &&
        Objects.equals(this.afterSummon, gameEvent.afterSummon) &&
        Objects.equals(this.spellCasted, gameEvent.spellCasted) &&
        Objects.equals(this.joust, gameEvent.joust) &&
        Objects.equals(this.weaponDestroyed, gameEvent.weaponDestroyed) &&
        Objects.equals(this.heroPowerUsed, gameEvent.heroPowerUsed) &&
        Objects.equals(this.cardRevealed, gameEvent.cardRevealed) &&
        Objects.equals(this.enrageChanged, gameEvent.enrageChanged) &&
        Objects.equals(this.targetAcquisition, gameEvent.targetAcquisition) &&
        Objects.equals(this.damage, gameEvent.damage) &&
        Objects.equals(this.weaponEquipped, gameEvent.weaponEquipped) &&
        Objects.equals(this.performedGameAction, gameEvent.performedGameAction) &&
        Objects.equals(this.physicalAttack, gameEvent.physicalAttack) &&
        Objects.equals(this.overload, gameEvent.overload) &&
        Objects.equals(this.heal, gameEvent.heal) &&
        Objects.equals(this.secretRevealed, gameEvent.secretRevealed) &&
        Objects.equals(this.summon, gameEvent.summon) &&
        Objects.equals(this.afterSpellCasted, gameEvent.afterSpellCasted) &&
        Objects.equals(this.discard, gameEvent.discard) &&
        Objects.equals(this.kill, gameEvent.kill) &&
        Objects.equals(this.triggerFired, gameEvent.triggerFired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, isPowerHistory, eventType, afterPhysicalAttack, drawCard, entityTouched, entityUntouched, preDamage, silence, secretPlayed, beforeSummon, cardPlayed, armorGained, afterSummon, spellCasted, joust, weaponDestroyed, heroPowerUsed, cardRevealed, enrageChanged, targetAcquisition, damage, weaponEquipped, performedGameAction, physicalAttack, overload, heal, secretRevealed, summon, afterSpellCasted, discard, kill, triggerFired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isPowerHistory: ").append(toIndentedString(isPowerHistory)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    afterPhysicalAttack: ").append(toIndentedString(afterPhysicalAttack)).append("\n");
    sb.append("    drawCard: ").append(toIndentedString(drawCard)).append("\n");
    sb.append("    entityTouched: ").append(toIndentedString(entityTouched)).append("\n");
    sb.append("    entityUntouched: ").append(toIndentedString(entityUntouched)).append("\n");
    sb.append("    preDamage: ").append(toIndentedString(preDamage)).append("\n");
    sb.append("    silence: ").append(toIndentedString(silence)).append("\n");
    sb.append("    secretPlayed: ").append(toIndentedString(secretPlayed)).append("\n");
    sb.append("    beforeSummon: ").append(toIndentedString(beforeSummon)).append("\n");
    sb.append("    cardPlayed: ").append(toIndentedString(cardPlayed)).append("\n");
    sb.append("    armorGained: ").append(toIndentedString(armorGained)).append("\n");
    sb.append("    afterSummon: ").append(toIndentedString(afterSummon)).append("\n");
    sb.append("    spellCasted: ").append(toIndentedString(spellCasted)).append("\n");
    sb.append("    joust: ").append(toIndentedString(joust)).append("\n");
    sb.append("    weaponDestroyed: ").append(toIndentedString(weaponDestroyed)).append("\n");
    sb.append("    heroPowerUsed: ").append(toIndentedString(heroPowerUsed)).append("\n");
    sb.append("    cardRevealed: ").append(toIndentedString(cardRevealed)).append("\n");
    sb.append("    enrageChanged: ").append(toIndentedString(enrageChanged)).append("\n");
    sb.append("    targetAcquisition: ").append(toIndentedString(targetAcquisition)).append("\n");
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
    sb.append("    weaponEquipped: ").append(toIndentedString(weaponEquipped)).append("\n");
    sb.append("    performedGameAction: ").append(toIndentedString(performedGameAction)).append("\n");
    sb.append("    physicalAttack: ").append(toIndentedString(physicalAttack)).append("\n");
    sb.append("    overload: ").append(toIndentedString(overload)).append("\n");
    sb.append("    heal: ").append(toIndentedString(heal)).append("\n");
    sb.append("    secretRevealed: ").append(toIndentedString(secretRevealed)).append("\n");
    sb.append("    summon: ").append(toIndentedString(summon)).append("\n");
    sb.append("    afterSpellCasted: ").append(toIndentedString(afterSpellCasted)).append("\n");
    sb.append("    discard: ").append(toIndentedString(discard)).append("\n");
    sb.append("    kill: ").append(toIndentedString(kill)).append("\n");
    sb.append("    triggerFired: ").append(toIndentedString(triggerFired)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

