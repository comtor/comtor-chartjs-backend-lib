package net.comtor.chartjs.Options;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Events {

    /**
     * <p>
     * List of standard DOM events.
     * </p>
     * <p>
     * Adapted from
     * <a href="https://developer.mozilla.org/en-US/docs/Web/Events">MDN</a>.
     * </p>
     */
    public static final String EVENT_ABORT = "abort";
    public static final String EVENT_AFTER_PRINT = "afterprint";
    public static final String EVENT_ANIMATION_END = "animationend";
    public static final String EVENT_ANIMATION_ITERATION = "animationiteration";
    public static final String EVENT_ANIMATION_START = "animationstart";
    public static final String EVENT_AUDIO_PROCESS = "audioprocess";
    public static final String EVENT_AUDIO_END = "audioend";
    public static final String EVENT_AUDIO_START = "audiostart";
    public static final String EVENT_BEFORE_PRINT = "beforeprint";
    public static final String EVENT_BEFORE_UNLOAD = "beforeunload";
    public static final String EVENT_BEGIN_EVENT = "beginEvent";
    public static final String EVENT_BLOCKED = "blocked";
    public static final String EVENT_BLUR = "blur";
    public static final String EVENT_BOUNDARY = "boundary";
    public static final String EVENT_CACHED = "cached";
    public static final String EVENT_CAN_PLAY = "canplay";
    public static final String EVENT_CAN_PLAY_TROUGH = "canplaythrough";
    public static final String EVENT_CHANGE = "change";
    public static final String EVENT_CHARGING_CHANGE = "chargingchange";
    public static final String EVENT_CHARGING_TIME_CHANGE = "chargingtimechange";
    public static final String EVENT_CHECKING = "checking";
    public static final String EVENT_CLICK = "click";
    public static final String EVENT_CLOSE = "close";
    public static final String EVENT_COMPLETE = "complete";
    public static final String EVENT_COMPOSITION_END = "compositionend";
    public static final String EVENT_COMPOSITION_START = "compositionstart";
    public static final String EVENT_COMPOSITION_UPDATE = "compositionupdate";
    public static final String EVENT_CONTEXT_MENU = "contextmenu";
    public static final String EVENT_COPY = "copy";
    public static final String EVENT_CUT = "cut";
    public static final String EVENT_DB_CLICK = "dblclick";
    public static final String EVENT_DEVICE_CHANGE = "devicechange";
    public static final String EVENT_DEVICE_LIGHT = "devicelight";
    public static final String EVENT_DEVICE_MOTION = "devicemotion";
    public static final String EVENT_DEVICE_ORIENTATION = "deviceorientation";
    public static final String EVENT_DEVICE_PROXIMITY = "deviceproximity";
    public static final String EVENT_DISCHARGING_TIME_CHANGE = "dischargingtimechange";
    public static final String EVENT_DOM_ACTIVATE = "DOMActivate";
    public static final String EVENT_DOM_ATTRIBUTE_NAME_CHANGED = "DOMAttributeNameChanged";
    public static final String EVENT_DOM_ATTR_MODIFIED = "DOMAttrModified";
    public static final String EVENT_DOM_CHARACTER_DATA_MODIFIED = "DOMCharacterDataModified";
    public static final String EVENT_DOM_CONTENT_LOADED = "DOMContentLoaded";
    public static final String EVENT_DOM_ELEMENT_NAME_CHANGED = "DOMElementNameChanged";
    public static final String EVENT_DOM_NODE_INSERT = "DOMNodeInserted";
    public static final String EVENT_DOM_NODE_INSERTED_INTO_DOCUMENT = "DOMNodeInsertedIntoDocument";
    public static final String EVENT_DOM_NODE_REMOVED = "DOMNodeRemoved";
    public static final String EVENT_DOM_NODE_REMOVED_FROM_DOCUMENT = "DOMNodeRemovedFromDocument";
    public static final String EVENT_DOM_SUBSTREE_MODIFIED = "DOMSubtreeModified";
    public static final String EVENT_DOWNLOADING = "downloading";
    public static final String EVENT_DRAG = "drag";
    public static final String EVENT_DRAG_END = "dragend";
    public static final String EVENT_DRAG_ENTER = "dragenter";
    public static final String EVENT_DRAG_LEAVE = "dragleave";
    public static final String EVENT_DRAG_OVER = "dragover";
    public static final String EVENT_DRAG_START = "dragstart";
    public static final String EVENT_DROP = "drop";
    public static final String EVENT_DURATION_CHANGE = "durationchange";
    public static final String EVENT_EMPTIED = "emptied";
    public static final String EVENT_END = "end";
    public static final String EVENT_ENDED = "ended";
    public static final String EVENT_END_EVENT = "endEvent";
    public static final String EVENT_ERROR = "error";
    public static final String EVENT_FOCUS = "focus";
    public static final String EVENT_FULL_SCREEN_CHANGE = "fullscreenchange";
    public static final String EVENT_FULL_SCREEN_ERROR = "fullscreenerror";
    public static final String EVENT_GAMEPAD_CONNECTED = "gamepadconnected";
    public static final String EVENT_GAME_PADDING_DISCONNECTED = "gamepaddisconnected";
    public static final String EVENT_GOT_POINTER_CAPTURE = "gotpointercapture";
    public static final String EVENT_BASH_CHANGE = "hashchange";
    public static final String EVENT_LOST_POINTER_CAPTURE = "lostpointercapture";
    public static final String EVENT_INPUT = "input";
    public static final String EVENT_INVALID = "invalid";
    public static final String EVENT_KEYDOWN = "keydown";
    public static final String EVENT_KEYPRESS = "keypress";
    public static final String EVENT_KEYUP = "keyup";
    public static final String EVENT_LANGUAGE_CHANGE = "languagechange";
    public static final String EVENT_LEVEL_CHANGE = "levelchange";
    public static final String EVENT_LOAD = "load";
    public static final String EVENT_LOAD_DATA = "loadeddata";
    public static final String EVENT_LOADED_METADATA = "loadedmetadata";
    public static final String EVENT_LOAD_END = "loadend";
    public static final String EVENT_LOAD_START = "loadstart";
    public static final String EVENT_MARK = "mark";
    public static final String EVENT_MESSAGE = "message";
    public static final String EVENT_MOUSE_DOWN = "mousedown";
    public static final String EVENT_MOUSE_ENTER = "mouseenter";
    public static final String EVENT_MOUSE_LEAVE = "mouseleave";
    public static final String EVENT_MOUSE_MOVE = "mousemove";
    public static final String EVENT_MOUSE_OUT = "mouseout";
    public static final String EVENT_MOUSE_OVER = "mouseover";
    public static final String EVENT_MOUSE_UP = "mouseup";
    public static final String EVENT_NOMATCH = "nomatch";
    public static final String EVENT_NOTIFICATION_CLICK = "notificationclick";
    public static final String EVENT_NOUPDATE = "noupdate";
    public static final String EVENT_OBSOLETE = "obsolete";
    public static final String EVENT_OFFLINE = "offline";
    public static final String EVENT_ONLINE = "online";
    public static final String EVENT_OPEN = "open";
    public static final String EVENT_ORIENTATION_CHANGE = "orientationchange";
    public static final String EVENT_PAGE_HIDE = "pagehide";
    public static final String EVENT_PAGE_SHOW = "pageshow";
    public static final String EVENT_PASTE = "paste";
    public static final String EVENT_PAUSE = "pause";
    public static final String EVENT_POINTER_CANCEL = "pointercancel";
    public static final String EVENT_POINTER_DOWN = "pointerdown";
    public static final String EVENT_POINTER_ENTER = "pointerenter";
    public static final String EVENT_POINTER_LEAVE = "pointerleave";
    public static final String EVENT_POINTER_LOCK_CHANGE = "pointerlockchange";
    public static final String EVENT_POINTER_LOCK_ERROR = "pointerlockerror";
    public static final String EVENT_POINTER_MOVE = "pointermove";
    public static final String EVENT_POINTER_OUT = "pointerout";
    public static final String EVENT_POINTER_OVER = "pointerover";
    public static final String EVENT_POINTER_UP = "pointerup";
    public static final String EVENT_PLAY = "play";
    public static final String EVENT_PLAYING = "playing";
    public static final String EVENT_POP_STATE = "popstate";
    public static final String EVENT_PROGRESS = "progress";
    public static final String EVENT_PUSH = "push";
    public static final String EVENT_PUSH_SUBSCRIPTION_CHANGE = "pushsubscriptionchange";
    public static final String EVENT_RATE_CHANGE = "ratechange";
    public static final String EVENT_READY_STATE_CHANGE = "readystatechange";
    public static final String EVENT_REPEAT_EVENT = "repeatEvent";
    public static final String EVENT_RESET = "reset";
    public static final String EVENT_RESIZE = "resize";
    public static final String EVENT_RESOURCE_TIMING_BUFFER_FULL = "resourcetimingbufferfull";
    public static final String EVENT_RESULT = "result";
    public static final String EVENT_RESUME = "resume";
    public static final String EVENT_SCROLL = "scroll";
    public static final String EVENT_SEEKED = "seeked";
    public static final String EVENT_SEEKING = "seeking";
    public static final String EVENT_SELECT = "select";
    public static final String EVENT_SELEC_START = "selectstart";
    public static final String EVENT_SELECTION_CHANGE = "selectionchange";
    public static final String EVENT_SHOW = "show";
    public static final String EVENT_SOUNDED = "soundend";
    public static final String EVENT_SOUND_START = "soundstart";
    public static final String EVENT_SPEECH_END = "speechend";
    public static final String EVENT_SPEECH_START = "speechstart";
    public static final String EVENT_STALLED = "stalled";
    public static final String EVENT_START = "start";
    public static final String EVENT_STORAGE = "storage";
    public static final String EVENT_SUBMIT = "submit";
    public static final String EVENT_SUCCESS = "success";
    public static final String EVENT_SUSPEND = "suspend";
    public static final String EVENT_SVG_ABORT = "SVGAbort";
    public static final String EVENT_SVG_ERROR = "SVGError";
    public static final String EVENT_SVGLOAD = "SVGLoad";
    public static final String EVENT_SVG_RESIZE = "SVGResize";
    public static final String EVENT_SVG_SCROLL = "SVGScroll";
    public static final String EVENT_SVG_UNLOAD = "SVGUnload";
    public static final String EVENT_SVG_ZOOM = "SVGZoom";
    public static final String EVENT_TIMEOUT = "timeout";
    public static final String EVENT_TIME_UPDATE = "timeupdate";
    public static final String EVENT_TOUCHED_CANCEL = "touchcancel";
    public static final String EVENT_TOUCHED = "touchend";
    public static final String EVENT_TOUCH_MOVE = "touchmove";
    public static final String EVENT_TOUCH_START = "touchstart";
    public static final String EVENT_TRANSITIONED = "transitionend";
    public static final String EVENT_UNLOAD = "unload";
    public static final String EVENT_UPDATE_READY = "updateready";
    public static final String EVENT_UPGRADE_DENEEDED = "upgradeneeded";
    public static final String EVENT_USER_PROXIMITY = "userproximity";
    public static final String EVENT_VOICES_CHANGE = "voiceschanged";
    public static final String EVENT_VERSION_CHANGE = "versionchange";
    public static final String EVENT_VISIBILITY_CHANGE = "visibilitychange";
    public static final String EVENT_VOLUME_CHANGE = "volumechange";
    public static final String EVENT_VR_DISPLAY_CONNECTED = "vrdisplayconnected";
    public static final String EVENT_VR_DISPLAY_DISCONNECTED = "vrdisplaydisconnected";
    public static final String EVENT_VR_DISPLAY_PRESENTCHANGE = "vrdisplaypresentchange";
    public static final String EVENT_WAITING = "waiting";
    public static final String EVENT_WHEEL = "wheel";
    public static final String EVENT_MOUSEMOVE = "mousemove";
    public static final String EVENT_MOUSEOUT = "mousemove";
    public static final String EVENT_TOUCHSTART = "touchstart";
    public static final String EVENT_TOUCHMOVE = "touchmove";

    private List<String> String;
    private String onHover;
    private String onClick;

    public Events() {
    }

    public Events(List<String> String) {
        this.String = String;
    }

    public Events(List<String> String, String onHover, String onClick) {
        this.String = String;
        this.onHover = onHover;
        this.onClick = onClick;
    }

    public List<String> getEvents() {
        return String;
    }

    public void setEvents(List<String> String) {
        this.String = String;
    }

    public String getOnHover() {
        return onHover;
    }

    public void setOnHover(String onHover) {
        this.onHover = onHover;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

}
